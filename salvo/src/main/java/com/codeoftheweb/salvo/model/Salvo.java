package com.codeoftheweb.salvo.model;

import javax.persistence.*;

@Entity
public class Salvo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private GamePlayer gamePlayerId;
    //Se van contando los turnos, cada disparo está asociado con el turno en que se hizo
    private Integer turn;

    //Empty Constructor
    public Salvo() {
    }

    //Constructor with parameters
    public Salvo(Long id, GamePlayer gamePlayerId, Integer turn) {
        this.id = id;
        this.gamePlayerId = gamePlayerId;
        this.turn = turn;
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

    public Integer getTurn() {
        return turn;
    }

    public void setTurn(Integer turn) {
        this.turn = turn;
    }

    //toString Method
    @Override
    public String toString() {
        return "Salvo{" +
                "id=" + id +
                ", gamePlayerId=" + gamePlayerId +
                ", turn=" + turn +
                '}';
    }
}
