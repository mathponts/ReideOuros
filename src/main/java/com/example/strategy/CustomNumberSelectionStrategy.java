package com.example.strategy;

import java.util.Scanner;

public class CustomNumberSelectionStrategy implements NumberSelectionStrategy {
    private final Scanner scanner;

    public CustomNumberSelectionStrategy() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public int selectNumber() {
        System.out.print("Escolha um número: ");
        return scanner.nextInt();
    }
}