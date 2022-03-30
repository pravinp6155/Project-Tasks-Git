package com.cjc.main.Exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {
	@ExceptionHandler(PageNotFound.class)
	public String productNotfound(PageNotFound e) {
		return e.getMessage();
	}

}
