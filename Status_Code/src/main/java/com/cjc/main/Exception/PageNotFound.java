package com.cjc.main.Exception;

public class PageNotFound  extends RuntimeException{
	
	public PageNotFound(String msg) {
		super(msg);
		System.out.println("call");
	}

}
