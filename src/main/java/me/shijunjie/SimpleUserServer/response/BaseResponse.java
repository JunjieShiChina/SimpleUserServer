package me.shijunjie.SimpleUserServer.response;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;

@ApiModel(description = "返回响应数据")
public class BaseResponse implements Serializable {

	private static final long serialVersionUID = 1232134556532324231L;
	
	private int status;
	private String message;
	private Object data;
	
	public BaseResponse() {
	}
	
	public BaseResponse(int status, String message) {
		this.status = status;
		this.message = message;
	}

}
