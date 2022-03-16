package com.sofkaTaller09.Bingo.service;

import com.sofkaTaller09.Bingo.dao.GameDao;
import com.sofkaTaller09.Bingo.domain.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

public class GameService implements IGameService {
    @Autowired // Para inyectar GameDao
    private GameDao gameDao;

    @Override
    @Transactional(readOnly = true)
    public List<Game> list() {
        return (List<Game>) gameDao.findAll();
    }

    @Override
    @Transactional
    public Game save(Game game) {
        return gameDao.save(game);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Game> findGame(Game game) {
        return gameDao.findById(game.getGameId());
    }
}
