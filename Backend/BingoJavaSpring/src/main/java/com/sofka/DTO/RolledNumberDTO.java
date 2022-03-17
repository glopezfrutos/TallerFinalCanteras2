package com.sofka.DTO;

import lombok.Data;

import java.io.Serializable;

@Data
public class RolledNumberDTO implements Serializable {
    private Integer rolledNumber;
    private Long gameId;
}
