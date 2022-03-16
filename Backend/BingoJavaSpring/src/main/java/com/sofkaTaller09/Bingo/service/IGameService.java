package com.sofkaTaller09.Bingo.service;

import com.sofkaTaller09.Bingo.domain.Game;

import java.util.List;
import java.util.Optional;

public interface IGameService {
    public List<Game> list();

    public Game save(Game game);

    public Optional<Game> findGame(Game game);
}
