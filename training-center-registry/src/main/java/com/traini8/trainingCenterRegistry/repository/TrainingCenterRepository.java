package com.traini8.trainingCenterRegistry.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.traini8.trainingCenterRegistry.model.TrainingCenter;

@Repository
public interface TrainingCenterRepository extends JpaRepository<TrainingCenter, Long> {

}
