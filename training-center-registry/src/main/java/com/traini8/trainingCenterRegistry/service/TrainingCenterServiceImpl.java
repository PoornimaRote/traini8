package com.traini8.trainingCenterRegistry.service;

import java.time.Instant;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.traini8.trainingCenterRegistry.model.TrainingCenter;
import com.traini8.trainingCenterRegistry.repository.TrainingCenterRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class TrainingCenterServiceImpl implements TrainingCenterService {

	private final TrainingCenterRepository trainingCenterRepository;

	@Override
	public TrainingCenter save(TrainingCenter trainingCenter) {
		trainingCenter.setCreatedOn(Date.from(Instant.now()));
		return trainingCenterRepository.save(trainingCenter);
	}

	@Override
	public List<TrainingCenter> getAllTrainingCenters() {
		return trainingCenterRepository.findAll();
	}
}
