package com.codeoftheweb.salvo.rest.controller;

import com.codeoftheweb.salvo.model.Player;
import com.codeoftheweb.salvo.service.PlayerService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/players")
public class PlayerRestController {

    @Autowired
    private PlayerService playerService;
    @Autowired
    private ObjectMapper objectMapper;

    @GetMapping
    public List<Player> findAll() {
        return playerService.findAll();
    }

    @GetMapping("/{id}")
    public Player findPlayerById(@PathVariable("id") Long id) {
        return playerService.findById(id).orElseThrow(()->new RuntimeException());
    }

    @PostMapping
    public Player createPlayer(@RequestBody Player player) {
        return playerService.createPlayer(player);
    }

}
