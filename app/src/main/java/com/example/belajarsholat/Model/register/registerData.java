package com.example.belajarsholat.Model.register;

import com.google.gson.annotations.SerializedName;

public class registerData {

	@SerializedName("name")
	private String name;

	@SerializedName("username")
	private String username;

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setUsername(String username){
		this.username = username;
	}

	public String getUsername(){
		return username;
	}
}