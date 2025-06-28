package com.myairline.arms.controller;

import com.myairline.arms.dto.Planedto;
import com.myairline.arms.service.PlaneService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/flights")
@RequiredArgsConstructor
public class FlightController {

    private final PlaneService planeService;

    @GetMapping("/search")
    public ResponseEntity<List<Planedto>> searchFlights(
            @RequestParam String start,
            @RequestParam String end
    ) {
        List<Planedto> flights = planeService.searchPlanes(start, end);
        return ResponseEntity.ok(flights);
    }
}
