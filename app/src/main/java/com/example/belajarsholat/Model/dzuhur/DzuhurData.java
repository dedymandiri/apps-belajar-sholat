package com.example.belajarsholat.Model.dzuhur;

import com.google.gson.annotations.SerializedName;

public class DzuhurData {

	@SerializedName("id_dzuhur")
	private String idDzuhur;

	@SerializedName("deskripsi_dzuhur")
	private String deskripsiDzuhur;

	@SerializedName("judul_dzuhur")
	private String judulDzuhur;

	public void setIdDzuhur(String idDzuhur){
		this.idDzuhur = idDzuhur;
	}

	public String getIdDzuhur(){
		return idDzuhur;
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