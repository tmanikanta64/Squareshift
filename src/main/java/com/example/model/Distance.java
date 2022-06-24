package com.example.model;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@XmlRootElement
@JsonIgnoreProperties(ignoreUnknown = true)
public class Distance {
	
	int distance_in_kilometers;
	String status;
	
	
	public int getDistance_in_kilometers() {
		return distance_in_kilometers;
	}
	public void setDistance_in_kilometers(int distance_in_kilometers) {
		this.distance_in_kilometers = distance_in_kilometers;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	

}
