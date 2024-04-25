package com.traini8.trainingCenterRegistry.controller;

import java.time.Instant;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.traini8.trainingCenterRegistry.model.TrainingCenter;
import com.traini8.trainingCenterRegistry.service.TrainingCenterService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/training-centers")
public class TrainingCenterController {
	@Autowired
	private TrainingCenterService trainingCenterService;

	@PostMapping
	public ResponseEntity<TrainingCenter> createTrainingCenter(@Valid @RequestBody TrainingCenter trainingCenter) {
		trainingCenter.setCreatedOn(Date.from(Instant.now()));
		TrainingCenter savedTrainingCenter = trainingCenterService.save(trainingCenter);
		return new ResponseEntity<>(savedTrainingCenter, HttpStatus.CREATED);
	}

	@GetMapping
	public ResponseEntity<List<TrainingCenter>> getAllTrainingCenters() {
		List<TrainingCenter> trainingCenters = trainingCenterService.getAllTrainingCenters();
		return new ResponseEntity<>(trainingCenters, HttpStatus.OK);
	}

}
