package com.company;

import java.util.ArrayList;

public class Brocker {
    String name;
    ArrayList<Load> loads;

    public void displayDashboar(){
        for(int i =0; i< loads.size(); i++ ){
            System.out.printf("%d. P/m: %.2f$, T/P : %.2f$ ",i+1, loads.get(i).pricePerMile, loads.get(i).priceTotal );
            System.out.println();
        }
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Load> getLoads() {
        return loads;
    }

    public void setLoads(ArrayList<Load> loads) {
        this.loads = loads;
    }
}
