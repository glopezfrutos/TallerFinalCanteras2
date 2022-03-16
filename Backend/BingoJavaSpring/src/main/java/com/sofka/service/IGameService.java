package com.sofka.service;

import com.sofka.domain.Game;

import java.util.List;
import java.util.Optional;

public interface IGameService {
    public List<Game> listGame();

    public Game save(Game game);

    public Optional<Game> findGame(Game game);
}