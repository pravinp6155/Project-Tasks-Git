package com.cjc.main.Exception;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {
	@ExceptionHandler(PageNotFound.class)
	public ResponseEntity<ApiError> productNotfound(PageNotFound e ,HttpServletRequest request) {
		System.out.println("Exception Handler Method Call");
		
		ApiError error= new ApiError(HttpStatus.NOT_FOUND.value(), new Date(), HttpStatus.NOT_FOUND, e.getMessage(), request.getRequestURI());
				
		
		return new ResponseEntity<ApiError>(error,HttpStatus.NOT_FOUND);
	}

}
