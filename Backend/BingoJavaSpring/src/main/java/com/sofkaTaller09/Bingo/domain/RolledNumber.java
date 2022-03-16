package com.sofkaTaller09.Bingo.domain;
import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import java.io.Serializable;

@Data
@Entity
@Table(name = "rolled_number")
public class RolledNumber implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rolled_number")
    private Long rolledNumber;


    @Column(name = "game_id")
    private Long gameId;
}
