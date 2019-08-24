package com.codeoftheweb.salvo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Score {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Game gameId;
    private Player playerID;
    private Integer score;
    private Date finishDate;

    //Empty Constructor
    public Score() {
    }

    //Constructor with parameters
    public Score(Long id, Game gameId, Player playerID, Integer score, Date finishDate) {
        this.id = id;
        this.gameId = gameId;
        this.playerID = playerID;
        this.score = score;
        this.finishDate = finishDate;
    }

    //Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Game getGameId() {
        return gameId;
    }

    public void setGameId(Game gameId) {
        this.gameId = gameId;
    }

    public Player getPlayerID() {
        return playerID;
    }

    public void setPlayerID(Player playerID) {
        this.playerID = playerID;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Date getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(Date finishDate) {
        this.finishDate = finishDate;
    }

    //toString Method
    @Override
    public String toString() {
        return "Score{" +
                "id=" + id +
                ", gameId=" + gameId +
                ", playerID=" + playerID +
                ", score=" + score +
                ", finishDate=" + finishDate +
                '}';
    }
}
