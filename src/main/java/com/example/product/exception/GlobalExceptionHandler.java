package com.example.product.exception;

import com.example.product.model.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(ProductNotFound.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorResponse handleProductNotFoundException(ProductNotFound productNotFound){
        return new ErrorResponse(productNotFound.getMessage());
    }

    @ExceptionHandler(ProductBadRequestException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorResponse handleProductBadRequest(ProductBadRequestException productBadRequestException){
        return new ErrorResponse(productBadRequestException.getMessage());
    }
}
