package com.code.backend.controller;

import com.code.backend.model.Leaderboard;
import com.code.backend.repository.LeaderboardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("leaderboard")
public class LeaderboardController {
    @Autowired
    LeaderboardRepository leaderboardRepository;

    @GetMapping("test")
    private String string() {
        return "string";
    }

    @GetMapping
    public List<Leaderboard> getAllLeaderboard() {
        return leaderboardRepository.findAll();
    }

    @PostMapping
    public Leaderboard saveLeaderboard(@RequestBody Leaderboard leaderboard){
        return leaderboardRepository.save(leaderboard);
    }

    @PutMapping
    public List<Leaderboard> updateLeaderboard(@RequestBody List<Leaderboard> leaderboard){
        return leaderboardRepository.saveAll(leaderboard);
    }
}
