package com.code.backend.controller;

import com.code.backend.model.Leaderboard;
import com.code.backend.repository.LeaderboardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
public class LeaderboardController {
    @Autowired
    LeaderboardRepository leaderboardRepository;

    @GetMapping("test")
    private String string() {
        return "string";
    }

    @GetMapping("leaderboard")
    public List<Leaderboard> getAllLeaderboard() {
        return leaderboardRepository.findAll();
    }

    @PostMapping("leaderboard")
    public Leaderboard saveLeaderboard(@RequestBody Leaderboard leaderboard){
        return leaderboardRepository.save(leaderboard);
    }
}
