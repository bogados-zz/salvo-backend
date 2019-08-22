package com.codeoftheweb.salvo.service;

import com.codeoftheweb.salvo.model.Game;
import com.codeoftheweb.salvo.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;

    public Optional<Game> findById(Long id) {
        return gameRepository.findById(id);

    }


    public List<Game> findAll() {
        return gameRepository.findAll();
    }
}