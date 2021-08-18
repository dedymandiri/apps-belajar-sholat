package com.example.belajarsholat.Model.ashar;

import com.google.gson.annotations.SerializedName;

public class AsharData {

	@SerializedName("id_ashar")
	private String idAshar;

	@SerializedName("deskripsi_ashar")
	private String deskripsiAshar;

	@SerializedName("judul_ashar")
	private String judulAshar;

	public void setIdAshar(String idAshar){
		this.idAshar = idAshar;
	}

	public String getIdAshar(){
		return idAshar;
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