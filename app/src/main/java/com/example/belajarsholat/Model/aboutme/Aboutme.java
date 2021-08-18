package com.example.belajarsholat.Model.aboutme;

import com.google.gson.annotations.SerializedName;

public class Aboutme{

	@SerializedName("data")
	private AboutData aboutData;

	@SerializedName("message")
	private String message;

	@SerializedName("status")
	private boolean status;

	public void setData(AboutData aboutData){
		this.aboutData = aboutData;
	}

	public AboutData getData(){
		return aboutData;
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