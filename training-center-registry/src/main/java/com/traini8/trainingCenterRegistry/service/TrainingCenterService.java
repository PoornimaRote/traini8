package com.traini8.trainingCenterRegistry.service;

import java.util.List;

import com.traini8.trainingCenterRegistry.model.TrainingCenter;

public interface TrainingCenterService {
	TrainingCenter save(TrainingCenter trainingCenter);
	List<TrainingCenter> getAllTrainingCenters();
}
