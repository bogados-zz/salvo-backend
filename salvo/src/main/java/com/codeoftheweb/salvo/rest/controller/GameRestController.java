package com.codeoftheweb.salvo.rest.controller;

import com.codeoftheweb.salvo.model.Game;
import com.codeoftheweb.salvo.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/game")
@RestController
public class GameRestController {
    @Autowired
    private GameService gameService;

    @GetMapping
    public List<Game> findAll() {
        return gameService.findAll();

    }

    @GetMapping("/{id}")
    public Game findGameById(@PathVariable("id") Long id) {
        //return gameService.findById(id).orElseThrow(()->new RuntimeException());
        return gameService.findById(id).get();
    }
}
