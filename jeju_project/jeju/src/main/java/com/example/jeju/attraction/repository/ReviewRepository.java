package com.example.jeju.attraction.repository;

import com.example.jeju.attraction.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {

}
