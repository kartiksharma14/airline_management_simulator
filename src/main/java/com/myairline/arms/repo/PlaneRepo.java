package com.myairline.arms.repo;

import com.myairline.arms.entity.AirPlane;
import com.myairline.arms.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface PlaneRepo extends JpaRepository<AirPlane,Integer> {

    @Query("SELECT  a FROM AirPlane a WHERE a.start = ?1 AND a.end = ?2")
    AirPlane findByStartAndEnd(String start,String end);

    Optional<AirPlane> findById(int id);
}
