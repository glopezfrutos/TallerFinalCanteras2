package com.sofka.service;

import com.sofka.DTO.RolledNumberDTO;
import com.sofka.domain.RolledNumber;

import java.util.List;
import java.util.Optional;

public interface IRolledNumberService {
    public List<RolledNumber> listRolledNumber();

    public RolledNumber saveRolledNumber(RolledNumber rolledNumber);

    public Optional<RolledNumber> findRolledNumber(RolledNumber rolledNumber);

    public List<RolledNumberDTO> rolledNumberByGame(Long gameId);
}
