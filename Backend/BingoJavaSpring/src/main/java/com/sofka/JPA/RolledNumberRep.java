package com.sofka.JPA;

import com.sofka.DTO.RolledNumberDTO;
import com.sofka.domain.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RolledNumberRep extends JpaRepository<Game, Long> {
//    @Query("SELECT new com.sofka.domain.RolledNumber(rn.rolledNumber, g.gameId)"
//            + "FROM RolledNumber rn LEFT JOIN rn.game g")
//    List<RolledNumberDTO> fetchEmpDeptDataLeftJoin();
}
