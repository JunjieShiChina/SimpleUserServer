package me.shijunjie.SimpleUserServer.request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserRequest {
	private String userName;
	private String passWord;
}
