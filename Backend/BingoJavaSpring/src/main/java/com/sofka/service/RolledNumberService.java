package com.sofka.service;
import com.sofka.DTO.RolledNumberDTO;
import com.sofka.dao.RolledNumberDao;
import com.sofka.domain.RolledNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RolledNumberService implements IRolledNumberService {
    @Autowired
    private RolledNumberDao rolledNumberDao;

    @Override
    @Transactional(readOnly = true)
    public List<RolledNumber> listRolledNumber() {
        return (List<RolledNumber>) rolledNumberDao.findAll();
    }

    @Override
    @Transactional
    public RolledNumber saveRolledNumber(RolledNumber rolledNumber) {
        return rolledNumberDao.save(rolledNumber);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<RolledNumber> findRolledNumber(RolledNumber rolledNumber) {
        return rolledNumberDao.findById(rolledNumber.getRolledNumberId());
    }

    @Override
    public List<RolledNumberDTO> rolledNumberByGame(Long gameId) {
        return null;
    }
}
