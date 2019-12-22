package com.alojea.insurances.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "members")
public class Member {
	@Id
    String id;
	String name;
    String surname;
    Long policyNumber;
    String vehicleImageUrl;
    
    public Member() {
    	
    }
    
	public Member(String name, String surname, Long policyNumber, String vehicleImageUrl) {
		this.name = name;
		this.surname = surname;
		this.policyNumber = policyNumber;
		this.vehicleImageUrl = vehicleImageUrl;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public Long getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(Long policyNumber) {
		this.policyNumber = policyNumber;
	}
	public String getVehicleImageUrl() {
		return vehicleImageUrl;
	}
	public void setVehicleImageUrl(String vehicleImageUrl) {
		this.vehicleImageUrl = vehicleImageUrl;
	}
    
	
	
}
