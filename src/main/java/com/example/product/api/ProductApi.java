package com.example.product.api;

import com.example.product.model.ErrorResponse;
import com.example.product.model.ProductDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ProductApi {

    @Tag(name = "Products", description = "Obtain the product list")
    @Operation(
            summary = "List of products",
            description = "The all products"
    )
    @ApiResponses(
            value={
                    @ApiResponse(
                            responseCode = "200", description = "${api.responseCodes.ok.description}"
                    ),
                    @ApiResponse(
                            responseCode = "400", description = "${api.responseCodes.badRequest.description}"
                    ),
                    @ApiResponse(
                            responseCode = "500", description = "${api.responseCodes.internalServer.description}",
                            content = {
                                    @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))
                            }
                    ),
            }
    )
    ResponseEntity<List<ProductDto>> index();
    @Tag(name = "Prodcts", description = "Obtain one product by id")
    ResponseEntity<ProductDto> obtain(Integer id);
}
