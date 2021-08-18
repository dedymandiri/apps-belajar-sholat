package com.example.belajarsholat.Model.aboutme;

import com.google.gson.annotations.SerializedName;

public class AboutData {

	@SerializedName("id")
	private String id;

	@SerializedName("deskripsiabout")
	private String deskripsi;

	@SerializedName("judulabout")
	private String judul;

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setDeskripsi(String deskripsi){
		this.deskripsi = deskripsi;
	}

	public String getDeskripsi(){
		return deskripsi;
	}

	public void setJudul(String judul){
		this.judul = judul;
	}

	public String getJudul(){
		return judul;
	}
}