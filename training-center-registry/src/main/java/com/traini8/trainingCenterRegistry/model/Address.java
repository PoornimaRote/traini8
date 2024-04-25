package com.traini8.trainingCenterRegistry.model;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data			// Getters and setters
@Embeddable
public class Address {

	@NotBlank(message = "Detailed address cannot be empty or null")
	private String detailedAddress;

	@NotBlank(message = "City cannot be empty or null")
	private String city;

	@NotBlank(message = "State cannot be empty or null")
	private String state;

	@NotBlank(message = "Pincode cannot be empty or null")
	private String pincode;

}
