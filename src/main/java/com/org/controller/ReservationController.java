package com.org.controller;

import com.org.model.Reservation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/resturant/reservation")
public interface ReservationController {
    @GetMapping
    ResponseEntity<List<Reservation>> getAllReservations();
}
