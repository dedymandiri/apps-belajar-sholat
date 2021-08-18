package com.example.belajarsholat.Model.isya;

import com.google.gson.annotations.SerializedName;

public class IsyaData {

	@SerializedName("judul_isya")
	private String judulIsya;

	@SerializedName("id_isya")
	private String idIsya;

	@SerializedName("deskripsi_isya")
	private String deskripsiIsya;

	public void setJudulIsya(String judulIsya){
		this.judulIsya = judulIsya;
	}

	public String getJudulIsya(){
		return judulIsya;
	}

	public void setIdIsya(String idIsya){
		this.idIsya = idIsya;
	}

	public String getIdIsya(){
		return idIsya;
	}

	public void setDeskripsiIsya(String deskripsiIsya){
		this.deskripsiIsya = deskripsiIsya;
	}

	public String getDeskripsiIsya(){
		return deskripsiIsya;
	}
}