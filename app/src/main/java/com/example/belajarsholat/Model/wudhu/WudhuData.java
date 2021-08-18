package com.example.belajarsholat.Model.wudhu;

import com.google.gson.annotations.SerializedName;

public class WudhuData {

	@SerializedName("id_wudhu")
	private String idWudhu;

	@SerializedName("deskripsi_wudhu")
	private String deskripsiWudhu;

	@SerializedName("judul_wudhu")
	private String judulWudhu;

	public void setIdWudhu(String idWudhu){
		this.idWudhu = idWudhu;
	}

	public String getIdWudhu(){
		return idWudhu;
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