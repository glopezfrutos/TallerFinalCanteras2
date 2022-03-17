package com.sofka.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import java.io.Serializable;

@Data
@Entity
@Table(name = "rolled_number")
public class RolledNumber implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rolled_number_id", nullable = false)
    private Long rolledNumberId;

    @Column(name = "rolled_number", nullable = false)
    private Integer rolledNumber;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "game_id", nullable = false)
    private Game game;

//    public Game getGame() {
//        return game;
//    }
//
//    public void setGame(Game game) {
//        this.game = game;
//    }
//
//    public Integer getRolledNumber() {
//        return rolledNumber;
//    }
//
//    public void setRolledNumber(Integer rolledNumber) {
//        this.rolledNumber = rolledNumber;
//    }
//
//    public Long getId() {
//        return rolledNumberId;
//    }
//
//    public void setId(Long id) {
//        this.rolledNumberId = id;
//    }
}
