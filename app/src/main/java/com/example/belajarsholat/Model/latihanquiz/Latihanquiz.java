package com.example.belajarsholat.Model.latihanquiz;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Latihanquiz{

	@SerializedName("Latihanquiz")
	private List<LatihanquizItem> latihanquiz;

	public void setLatihanquiz(List<LatihanquizItem> latihanquiz){
		this.latihanquiz = latihanquiz;
	}

	public List<LatihanquizItem> getLatihanquiz(){
		return latihanquiz;
	}
}