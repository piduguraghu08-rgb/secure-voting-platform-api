package com.example.votingsystem.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/votes")
public class VoteController {

    @GetMapping("/hello")
    public String hello() {
        return "Voting System API Running Successfully";
    }
}
