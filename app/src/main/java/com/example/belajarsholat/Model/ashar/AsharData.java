package com.example.belajarsholat.Model.ashar;

import com.google.gson.annotations.SerializedName;

public class AsharData {

	@SerializedName("id")
	private String id;

	@SerializedName("deskripsi_ashar")
	private String deskripsiAshar;

	@SerializedName("judul_ashar")
	private String judulAshar;

	public void setIdAshar(String id){
		this.id = id;
	}

	public String getIdAshar(){
		return id;
	}

	public void setDeskripsiAshar(String deskripsiAshar){
		this.deskripsiAshar = deskripsiAshar;
	}

	public String getDeskripsiAshar(){
		return deskripsiAshar;
	}

	public void setJudulAshar(String judulAshar){
		this.judulAshar = judulAshar;
	}

	public String getJudulAshar(){
		return judulAshar;
	}
}