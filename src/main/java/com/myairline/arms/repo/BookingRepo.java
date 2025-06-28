package com.myairline.arms.repo;

import com.myairline.arms.entity.AirPlane;
import com.myairline.arms.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BookingRepo extends JpaRepository<Booking,Integer> {



}
