package com.thinkxfactor.zomatoplus.models;

import java.io.Serializable;

public class Restaurant implements Serializable{
	private String ResName;
	private String ResAdd;
	private long ResCon;
	private float ResRat;
	
	public Restaurant() {
		
	}
	
	public Restaurant(String ResName, String ResAdd, long ResCon, float ResRat) {
		this.ResName = ResName;
		this.ResAdd = ResAdd;
		this.ResCon = ResCon;
		this.ResRat = ResRat;
	}

	public String getResName() {
		return ResName;
	}

	public void setResName(String resName) {
		ResName = resName;
	}

	public String getResAdd() {
		return ResAdd;
	}

	public void setResAdd(String resAdd) {
		ResAdd = resAdd;
	}

	public long getResCon() {
		return ResCon;
	}

	public void setResCon(long resCon) {
		ResCon = resCon;
	}

	public float getResRat() {
		return ResRat;
	}

	public void setResRat(float resRat) {
		ResRat = resRat;
	}
	
	

}
