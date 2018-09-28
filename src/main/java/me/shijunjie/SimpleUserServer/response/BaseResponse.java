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
	
	public BaseResponse(int status, String message, Object data) {
		this.status = status;
		this.message = message;
		this.data = data;
	}
	
	public BaseResponse(RespStatus respStatus, Object data) {
		this.status = respStatus.getValue();
		this.message = respStatus.getMessage();
		this.data = data;
	}
	
	public BaseResponse(RespStatus respStatus) {
		this.status = respStatus.getValue();
		this.message = respStatus.getMessage();
	}
	
	public static BaseResponse ok(Object data) {
		return new BaseResponse(RespStatus.SUCCESS, data);
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
}
