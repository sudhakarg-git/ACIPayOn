package com.belk.payon.util.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class Risk {
	
	private String score;

	public Risk() {}
	
	public Risk(String score) {
		super();
		this.score = score;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}
	
	

}
