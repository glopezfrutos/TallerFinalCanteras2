package com.sofka.service;

import com.sofka.domain.Player;

import java.util.List;
import java.util.Optional;

public interface IPlayerService {
    public List<Player> listPlayer();

    public Player savePlayer(Player player);

    public Optional<Player> findPlayer(Player player);
}
