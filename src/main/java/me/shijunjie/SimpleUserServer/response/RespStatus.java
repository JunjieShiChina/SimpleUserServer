package me.shijunjie.SimpleUserServer.response;

public enum RespStatus {
	
	SUCCESS(200, "成功"),
	REQUEST_ERROR(400, "请求参数错误"),
	SERVER_ERROR(500, "服务器内部错误");
	
	private int value;
	private String message;
	private RespStatus(int value, String message) {
		this.value = value;
		this.message = message;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
