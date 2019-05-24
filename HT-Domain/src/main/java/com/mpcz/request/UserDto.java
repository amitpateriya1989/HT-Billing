package com.mpcz.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

public class UserDto {

	
	private Long userId;
	
	@NotEmpty(message = "Please enter a name")
	private String userName;

	@NotEmpty(message = "Please enter a UserId")
	private String userid;

	@NotEmpty(message = "Please enter a password")
	private String userCredentials;
	
	@Email(message="Please enter valid email id")
	private String userEmailId;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserCredentials() {
		return userCredentials;
	}

	public void setUserCredentials(String userCredentials) {
		this.userCredentials = userCredentials;
	}

	public String getUserEmailId() {
		return userEmailId;
	}

	public void setUserEmailId(String userEmailId) {
		this.userEmailId = userEmailId;
	}

	@Override
	public String toString() {
		return "UserDto [userId=" + userId + ", userName=" + userName + ", userid=" + userid + ", userCredentials="
				+ userCredentials + ", userEmailId=" + userEmailId + "]";
	}
	
	
	
}
