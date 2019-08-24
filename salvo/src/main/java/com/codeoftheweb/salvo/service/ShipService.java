package com.codeoftheweb.salvo.service;

import com.codeoftheweb.salvo.model.Ship;
import com.codeoftheweb.salvo.repository.ShipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShipService {
    @Autowired
    private ShipRepository shipRepository;

    public Optional<Ship> findById(Long id) {
        return shipRepository.findById(id);

    }


    public List<Ship> findAll() {
        return shipRepository.findAll();
    }
}