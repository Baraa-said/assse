//baraa asaad said
//1220280
//Lab Section :5

package asse;

import java.util.*;

public class Chair {
    private double weight;
    private double distanceFromFrontWall;
    private String color;
    private Date dateManufactured;

    public Chair() {
        setColor("red");
        setWeight(30);
        setDistanceFromFrontWall(20);
        setDateManufactured(new Date(105, 3, 11));
    }

    public Chair(double weight, double distanceFromFrontWall, String color, Date dateManufactured) {

    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setDistanceFromFrontWall(double distanceFromFrontWall) {
        this.distanceFromFrontWall = distanceFromFrontWall;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDateManufactured(Date dateManufactured) {
        this.dateManufactured = dateManufactured;
    }

    public double getWeight() {
        return this.weight;
    }

    public double getDistanceFromFrontWall() {
        return this.distanceFromFrontWall;
    }

    public String getColor() {
        return this.color;
    }

    public Date getDateManufactured() {
        return this.dateManufactured;
    }

    public void moveChairForward(double distance) {
        setDistanceFromFrontWall(getDistanceFromFrontWall() - distance);
    }

    public void moveChairBackward(double distance) {
        setDistanceFromFrontWall(getDistanceFromFrontWall() + distance);
    }

}
