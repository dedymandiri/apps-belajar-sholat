package com.example.belajarsholat.Model.wudhu;

import com.google.gson.annotations.SerializedName;

public class WudhuData {

	@SerializedName("id")
	private String id;

	@SerializedName("deskripsi_wudhu")
	private String deskripsiWudhu;

	@SerializedName("judul_wudhu")
	private String judulWudhu;

	public void setIdWudhu(String id){
		this.id = id;
	}

	public String getIdWudhu(){
		return id;
	}

	public void setDeskripsiWudhu(String deskripsiWudhu){
		this.deskripsiWudhu = deskripsiWudhu;
	}

	public String getDeskripsiWudhu(){
		return deskripsiWudhu;
	}

	public void setJudulWudhu(String judulWudhu){
		this.judulWudhu = judulWudhu;
	}

	public String getJudulWudhu(){
		return judulWudhu;
	}
}