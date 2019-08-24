package com.codeoftheweb.salvo.service;

import com.codeoftheweb.salvo.model.Salvo;
import com.codeoftheweb.salvo.repository.SalvoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SalvoService {

    @Autowired
    private SalvoRepository salvoRepository;


    public Optional<Salvo> findById(Long id) {
        return salvoRepository.findById(id);

    }


    public List<Salvo> findAll() {
        return salvoRepository.findAll();
    }
}
