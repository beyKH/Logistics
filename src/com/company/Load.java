package com.company;

public class Load {
    double pricePerMile;
    double priceTotal;

    public Load(double pricePerMile, double priceTotal) {
        this.pricePerMile = pricePerMile;
        this.priceTotal = priceTotal;
    }

    public double getPricePerMile() {
        return pricePerMile;
    }

    public void setPricePerMile(double pricePerMile) {
        this.pricePerMile = pricePerMile;
    }

    public double getPriceTotal() {
        return priceTotal;
    }

    public void setPriceTotal(double priceTotal) {
        this.priceTotal = priceTotal;
    }
}

