package com.example.belajarsholat.Model.subuh;

import com.google.gson.annotations.SerializedName;

public class SubuhData {

	@SerializedName("judul_subuh")
	private String judulSubuh;

	@SerializedName("id")
	private String id;

	@SerializedName("deskripsi_subuh")
	private String deskripsiSubuh;

	public void setJudulSubuh(String judulSubuh){
		this.judulSubuh = judulSubuh;
	}

	public String getJudulSubuh(){
		return judulSubuh;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setDeskripsiSubuh(String deskripsiSubuh){
		this.deskripsiSubuh = deskripsiSubuh;
	}

	public String getDeskripsiSubuh(){
		return deskripsiSubuh;
	}
}