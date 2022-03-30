package com.cjc.main.Exception;


import java.util.Date;

import org.springframework.http.HttpStatus;

public class ApiError {
	private int statuscode;
	private Date tdate;
	private HttpStatus error;
	private String errormsg;
	private String path;
	
	
	
	
	public ApiError() {
		
	}
	public ApiError(int statuscode, Date tdate, HttpStatus error, String errormsg, String path) {
		super();
		this.statuscode = statuscode;
		this.tdate = tdate;
		this.error = error;
		this.errormsg = errormsg;
		this.path = path;
	}
	public int getStatuscode() {
		return statuscode;
	}
	public void setStatuscode(int statuscode) {
		this.statuscode = statuscode;
	}
	public Date getTdate() {
		return tdate;
	}
	public void setTdate(Date tdate) {
		this.tdate = tdate;
	}
	public HttpStatus getError() {
		return error;
	}
	public void setError(HttpStatus error) {
		this.error = error;
	}
	public String getErrormsg() {
		return errormsg;
	}
	public void setErrormsg(String errormsg) {
		this.errormsg = errormsg;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	

}
