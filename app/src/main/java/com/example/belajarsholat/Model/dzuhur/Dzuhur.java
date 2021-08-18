package com.example.belajarsholat.Model.dzuhur;

import com.google.gson.annotations.SerializedName;

public class Dzuhur{

	@SerializedName("data")
	private DzuhurData data;

	@SerializedName("message")
	private String message;

	@SerializedName("status")
	private boolean status;

	public void setData(DzuhurData data){
		this.data = data;
	}

	public DzuhurData getData(){
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