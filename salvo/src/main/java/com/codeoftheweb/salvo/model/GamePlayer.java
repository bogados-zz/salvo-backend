package com.codeoftheweb.salvo.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class GamePlayer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date joinDate;
    @ManyToOne
    private Player playerId;
    @ManyToOne
    private Game gameId;

    //Empty Constructor
    public GamePlayer() {
    }

    //Constructor with parameters
    public GamePlayer(Long id, Date joinDate, Player playerId, Game gameId) {
        this.id = id;
        this.joinDate = joinDate;
        this.playerId = playerId;
        this.gameId = gameId;
    }

    //Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    public Player getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Player playerId) {
        this.playerId = playerId;
    }

    public Game getGameId() {
        return gameId;
    }

    public void setGameId(Game gameId) {
        this.gameId = gameId;
    }

    //toString Method
    @Override
    public String toString() {
        return "GamePlayer{" +
                "id=" + id +
                ", joinDate=" + joinDate +
                ", playerId=" + playerId +
                ", gameId=" + gameId +
                '}';
    }
}
