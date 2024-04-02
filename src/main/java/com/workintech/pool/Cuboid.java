package com.workintech.pool;

public class Cuboid extends Rectangle{
    private double height;

    public Cuboid(double width, double length, double height){
        super(length, width);
        this.height = height;
    }

    public double getHeight(){
        return this.height;
    }

    public double getVolume(){
        return super.getArea() * this.height;
    }
}
