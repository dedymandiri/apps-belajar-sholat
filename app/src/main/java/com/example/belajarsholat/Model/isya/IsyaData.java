package com.example.belajarsholat.Model.isya;

import com.google.gson.annotations.SerializedName;

public class IsyaData {

	@SerializedName("judul_isya")
	private String judulIsya;

	@SerializedName("id")
	private String id;

	@SerializedName("deskripsi_isya")
	private String deskripsiIsya;

	public void setJudulIsya(String judulIsya){
		this.judulIsya = judulIsya;
	}

	public String getJudulIsya(){
		return judulIsya;
	}

	public void setIdIsya(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setDeskripsiIsya(String deskripsiIsya){
		this.deskripsiIsya = deskripsiIsya;
	}

	public String getDeskripsiIsya(){
		return deskripsiIsya;
	}
}