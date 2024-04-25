package com.traini8.trainingCenterRegistry.model;

import java.util.Date;

import com.traini8.trainingCenterRegistry.model.Address;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data 				// Getters and setters
@Entity
public class TrainingCenter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Center name cannot be empty or null")
    @Size(max = 40, message = "Center name should be less than 40 characters")
    private String centerName;

    @NotBlank(message = "Center code cannot be empty or null")
    @Size(max = 12, message = "Center code should be exactly 12 characters")
    private String centerCode;

    @Embedded
    private Address address;

    @NotNull(message = "Student capacity cannot be null")
    private Integer studentCapacity;

    @NotBlank(message = "Courses offered cannot be empty or null")
    private String coursesOffered;

    @NotNull(message = "Created on cannot be null")
    private Date createdOn;

    @Email(message = "Contact email should be a valid email address")
    private String contactEmail;

    @NotBlank(message = "Contact phone cannot be empty or null")
    private String contactPhone;
}