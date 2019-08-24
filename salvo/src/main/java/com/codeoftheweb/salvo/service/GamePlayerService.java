package com.codeoftheweb.salvo.service;

import com.codeoftheweb.salvo.model.GamePlayer;
import com.codeoftheweb.salvo.repository.GamePlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GamePlayerService {
    @Autowired
    private GamePlayerRepository gamePlayerRepository;

    public Optional<GamePlayer> findById(Long id) {
        return gamePlayerRepository.findById(id);

    }


    public List<GamePlayer> findAll() {
        return gamePlayerRepository.findAll();
    }
}
