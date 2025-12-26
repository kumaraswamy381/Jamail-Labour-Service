package com.jamail.Labour.DTO;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name= "Labourer_Details")
public class LabourerDTO {
	@Id
	@GeneratedValue
	 private UUID id;
	 
	@Column(name= "Labour_Name")
	private String name;
	
	@Column(name= "Labour_PhNumber")
	private String PhoneNumber;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	public LabourerDTO(UUID id, String name, String phoneNumber) {
		super();
		this.id = id;
		this.name = name;
		PhoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "LabourerDTO [id=" + id + ", name=" + name + ", PhoneNumber=" + PhoneNumber + "]";
	}
	
	
}
