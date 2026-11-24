package org.example;

import java.math.BigDecimal;

public class VideoGame {
    private String title;
    private BigDecimal cost;

    //constructor overloading
    public VideoGame(String title, BigDecimal cost) {
        this.title = title;
        this.cost = cost;
    }

    public VideoGame(BigDecimal cost){
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }
}
