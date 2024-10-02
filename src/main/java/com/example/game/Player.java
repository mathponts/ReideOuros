package com.example.game;

import com.example.strategy.NumberSelectionStrategy;

public class Player {
    private final String name;
    private final NumberSelectionStrategy numberSelectionStrategy;
    private int chosenNumber;

    public Player(String name, NumberSelectionStrategy numberSelectionStrategy) {
        this.name = name;
        this.numberSelectionStrategy = numberSelectionStrategy;
    }

    public void selectNumber() {
        chosenNumber = numberSelectionStrategy.selectNumber();
        System.out.println(name + " escolheu o número: " + chosenNumber);
    }

    public int getChosenNumber() {
        return chosenNumber;
    }

    public String getName() {
        return name;
    }
}