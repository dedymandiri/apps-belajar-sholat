package com.example.belajarsholat.Model.subuh;

import com.google.gson.annotations.SerializedName;

public class Subuh{

	@SerializedName("data")
	private SubuhData data;

	@SerializedName("message")
	private String message;

	@SerializedName("status")
	private boolean status;

	public void setData(SubuhData data){
		this.data = data;
	}

	public SubuhData getData(){
		return data;
	}

	public void setMessage(String message){
		this.message = message;
	}

	public String getMessage(){
		return message;
	}

	public void setStatus(boolean status){
		this.status = status;
	}

	public boolean isStatus(){
		return status;
	}
}