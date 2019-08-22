package com.codeoftheweb.salvo.service;

import com.codeoftheweb.salvo.model.Player;
import com.codeoftheweb.salvo.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlayerService {
    @Autowired
    private PlayerRepository playerRepository;

    public Optional<Player> findById(Long id){
        return playerRepository.findById(id);

    }


    public List<Player> findAll() {
        return playerRepository.findAll();
    }
}
