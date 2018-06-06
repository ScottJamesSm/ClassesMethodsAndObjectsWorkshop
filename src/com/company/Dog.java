package com.company;

public class Dog {
    boolean furColor;
    double weight;
    int earSize;

    public Dog(double weight, int earSize) {
        this.weight = weight;
        this.earSize = earSize;
    }

    public boolean isFurColor() {
        return furColor;
    }

    public void setFurColor(boolean furColor) {
        this.furColor = furColor;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getEarSize() {
        return earSize;
    }

    public void setEarSize(int earSize) {
        this.earSize = earSize;
    }
}
