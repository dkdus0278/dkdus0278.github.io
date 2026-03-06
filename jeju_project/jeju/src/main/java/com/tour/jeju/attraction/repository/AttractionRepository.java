package com.tour.jeju.attraction.repository;

import com.tour.jeju.attraction.entity.Attraction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttractionRepository extends JpaRepository<Attraction, Long> {


}
