package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Please enter login : ");
        Scanner scanner = new Scanner(System.in);
        String loginBrcoker = scanner.nextLine();
        System.out.print("Please enter password : ");
        String passwordBrcoker = scanner.nextLine();

        if(loginBrcoker.equals("123") && passwordBrcoker.equals("321")) {
            System.out.println("Welcome to our brocker side you can star creare loads here: ");
            Brocker unBrocker = new Brocker();
            unBrocker.setLoads(createLoad());
            unBrocker.displayDashboar();
        }
    }

    public static ArrayList<Load> createLoad() {

        ArrayList<Load> loads = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String isDone = "";
        while (!(isDone.equals("yes"))) {
            System.out.println("Please enter price permiel");
            double input = scanner.nextDouble();

            System.out.println("Please enter price total");

            double inputTotal = scanner.nextDouble();

            loads.add(new Load(input, inputTotal));
            System.out.println("dou you have loads more? ");
            isDone = scanner.nextLine();

            return loads;

        }
        return loads;
    }
    }

