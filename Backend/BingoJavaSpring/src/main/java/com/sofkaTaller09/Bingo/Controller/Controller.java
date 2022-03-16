package com.sofkaTaller09.Bingo.Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import com.sofkaTaller09.Bingo.domain.Game;
import com.sofkaTaller09.Bingo.service.GameService;

@Slf4j
@RestController
//@CrossOrigin(origins = "http://localhost:4200")
public class Controller {
//    @Autowired
    private GameService gameService;

    @GetMapping ("/hello")
    public String hello() {
        log.info("Hola Mundo");
        return "Hola mundo";
    }

    @GetMapping(path = "/games")
    public List<Game> list() {
        return gameService.list();
    }

    @GetMapping(path = "/games/{id}")
    public Optional<Game> getGame(Game game) {
        return gameService.findGame(game);
    }

    @PostMapping(path = "/games")
    public ResponseEntity<Game> create(Game game) {
        log.info("Contacto a crear: {}", game);
        gameService.save(game);
        return new ResponseEntity<Game>(game, HttpStatus.CREATED);
    }
}

