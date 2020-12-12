package com.code.backend.repository;

import com.code.backend.model.Leaderboard;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeaderboardRepository  extends MongoRepository<Leaderboard, String> {
}
