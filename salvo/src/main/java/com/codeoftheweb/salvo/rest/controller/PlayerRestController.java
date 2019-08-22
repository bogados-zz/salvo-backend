package com.codeoftheweb.salvo.rest.controller;

import com.codeoftheweb.salvo.model.Player;
import com.codeoftheweb.salvo.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/player")
@RestController
public class PlayerRestController {
    @Autowired
    private PlayerService playerService;

    @GetMapping
    public List<Player> findAll() {
        return playerService.findAll();

    }

    @GetMapping("/{id}")
    public Player findPlayerById(@PathVariable("id") Long id) {
        //return playerService.findById(id).orElseThrow(()->new RuntimeException());
        return playerService.findById(id).get();
    }
}
