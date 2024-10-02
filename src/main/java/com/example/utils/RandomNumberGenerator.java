package com.example.utils;

import java.util.Random;

/**
 * Classe utilitária para gerar números aleatórios.
 */
public class RandomNumberGenerator {
    private static final Random random = new Random();

    public static int generateNumber() {
        return random.nextInt(100); // Gera um número entre 0 e 99
    }
}