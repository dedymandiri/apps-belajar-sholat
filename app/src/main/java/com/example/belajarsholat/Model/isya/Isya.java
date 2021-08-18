package com.example.belajarsholat.Model.isya;

import com.google.gson.annotations.SerializedName;

public class Isya{

	@SerializedName("data")
	private IsyaData data;

	@SerializedName("message")
	private String message;

	@SerializedName("status")
	private boolean status;

	public void setData(IsyaData data){
		this.data = data;
	}

	public IsyaData getData(){
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