package com.example.belajarsholat.Model.wudhu;

import com.google.gson.annotations.SerializedName;

public class Wudhu{

	@SerializedName("data")
	private WudhuData wudhuData;

	@SerializedName("message")
	private String message;

	@SerializedName("status")
	private boolean status;

	public void setData(WudhuData wudhuData){
		this.wudhuData = wudhuData;
	}

	public WudhuData getData(){
		return wudhuData;
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