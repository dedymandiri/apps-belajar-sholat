package com.example.belajarsholat.Model.dzuhur;

import com.google.gson.annotations.SerializedName;

public class DzuhurData {

	@SerializedName("id")
	private String id;

	@SerializedName("deskripsi_dzuhur")
	private String deskripsiDzuhur;

	@SerializedName("judul_dzuhur")
	private String judulDzuhur;

	public void setId(String id){
		this.id= id;
	}

	public String getId(){
		return id;
	}

	public void setDeskripsiDzuhur(String deskripsiDzuhur){
		this.deskripsiDzuhur = deskripsiDzuhur;
	}

	public String getDeskripsiDzuhur(){
		return deskripsiDzuhur;
	}

	public void setJudulDzuhur(String judulDzuhur){
		this.judulDzuhur = judulDzuhur;
	}

	public String getJudulDzuhur(){
		return judulDzuhur;
	}
}