package com.example.strategy;

import java.util.Random;

/**
 * Estratégia que escolhe um número aleatório entre 1 e 10.
 */
public class RandomNumberSelectionStrategy implements NumberSelectionStrategy {
    private Random random = new Random();

    @Override
    public int selectNumber() {
        return random.nextInt(10) + 1; // Números de 1 a 10
    }
}