package com.example.belajarsholat.Model;

import com.google.gson.annotations.SerializedName;

public class DataItem{

	@SerializedName("a")
	private String A;

	@SerializedName("soal")
	private String soal;

	@SerializedName("b")
	private String B;

	@SerializedName("c")
	private String C;

	@SerializedName("jwaban")
	private String jwaban;

	@SerializedName("id")
	private String id;

	@SerializedName("gambar")
	private String gambar;

	public void setA(String A){
		this.A = A;
	}

	public String getA(){
		return A;
	}

	public void setSoal(String soal){
		this.soal = soal;
	}

	public String getSoal(){
		return soal;
	}

	public void setB(String B){
		this.B = B;
	}

	public String getB(){
		return B;
	}

	public void setC(String C){
		this.C = C;
	}

	public String getC(){
		return C;
	}

	public void setJwaban(String jwaban){
		this.jwaban = jwaban;
	}

	public String getJwaban(){
		return jwaban;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setGambar(String gambar){
		this.gambar = gambar;
	}

	public String getGambar(){
		return gambar;
	}
}