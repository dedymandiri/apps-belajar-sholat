package com.example.belajarsholat.Model.maghrib;

import com.google.gson.annotations.SerializedName;

public class MaghribData {

	@SerializedName("id_maghrib")
	private String idMaghrib;

	@SerializedName("judul_maghrib")
	private String judulMaghrib;

	@SerializedName("deskripsi_maghrib")
	private String deskripsiMaghrib;

	public void setIdMaghrib(String idMaghrib){
		this.idMaghrib = idMaghrib;
	}

	public String getIdMaghrib(){
		return idMaghrib;
	}

	public void setJudulMaghrib(String judulMaghrib){
		this.judulMaghrib = judulMaghrib;
	}

	public String getJudulMaghrib(){
		return judulMaghrib;
	}

	public void setDeskripsiMaghrib(String deskripsiMaghrib){
		this.deskripsiMaghrib = deskripsiMaghrib;
	}

	public String getDeskripsiMaghrib(){
		return deskripsiMaghrib;
	}
}