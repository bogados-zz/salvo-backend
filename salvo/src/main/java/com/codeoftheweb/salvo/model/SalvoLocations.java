package com.codeoftheweb.salvo.model;

public class SalvoLocations {

    private Salvo salvoId;

    //Es un String con las coordenadas por ejemplo "A10"
    private String cell;

    //Empty Constructor
    public SalvoLocations() {
    }

    //Constructor with parameters
    public SalvoLocations(Salvo salvoId, String cell) {
        this.salvoId = salvoId;
        this.cell = cell;
    }

    //Getters and Setters
    public Salvo getSalvoId() {
        return salvoId;
    }

    public void setSalvoId(Salvo salvoId) {
        this.salvoId = salvoId;
    }

    public String getCell() {
        return cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }

    //toString Method
    @Override
    public String toString() {
        return "SalvoLocations{" +
                "salvoId=" + salvoId +
                ", cell='" + cell + '\'' +
                '}';
    }
}
