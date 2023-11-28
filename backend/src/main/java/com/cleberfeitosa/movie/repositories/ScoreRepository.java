package com.cleberfeitosa.movie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cleberfeitosa.movie.entities.Score;
import com.cleberfeitosa.movie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
