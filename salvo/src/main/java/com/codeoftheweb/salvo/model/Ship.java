package com.codeoftheweb.salvo.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

public class Ship {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private GamePlayer gamePlayerId;

    //Empty Constructor
    public Ship() {
    }

    //Constructor with parameters
    public Ship(Long id, GamePlayer gamePlayerId) {
        this.id = id;
        this.gamePlayerId = gamePlayerId;
    }

    //Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public GamePlayer getGamePlayerId() {
        return gamePlayerId;
    }

    public void setGamePlayerId(GamePlayer gamePlayerId) {
        this.gamePlayerId = gamePlayerId;
    }

    //to String Method
    @Override
    public String toString() {
        return "Ship{" +
                "id=" + id +
                ", gamePlayerId=" + gamePlayerId +
                '}';
    }
}
