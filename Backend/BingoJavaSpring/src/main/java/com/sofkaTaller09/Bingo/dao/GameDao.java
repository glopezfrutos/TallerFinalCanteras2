package com.sofkaTaller09.Bingo.dao;

import com.sofkaTaller09.Bingo.domain.Game;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface GameDao extends CrudRepository<Game, Long> {
    @Modifying
    @Query("update Game g set g.playerId = :nombre where g.playerId = :id")
    public void updatePlayer(
            @Param(value = "id") Long id,
            @Param(value = "playerId") Long playerId
    );
}
