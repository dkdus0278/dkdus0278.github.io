package com.tour.jeju.attraction.repository;

import com.tour.jeju.attraction.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {

}
