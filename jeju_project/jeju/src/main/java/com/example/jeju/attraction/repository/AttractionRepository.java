package com.example.jeju.attraction.repository;

import com.example.jeju.attraction.entity.Attraction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttractionRepository extends JpaRepository<Attraction, Long> {


}
