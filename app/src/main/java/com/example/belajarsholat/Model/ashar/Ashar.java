package com.example.belajarsholat.Model.ashar;

import com.google.gson.annotations.SerializedName;

public class Ashar{

	@SerializedName("data")
	private AsharData asharData;

	@SerializedName("message")
	private String message;

	@SerializedName("status")
	private boolean status;

	public void setData(AsharData asharData){
		this.asharData = asharData;
	}

	public AsharData getData(){
		return asharData;
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