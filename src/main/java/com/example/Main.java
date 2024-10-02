package com.example;

import com.example.game.Game;
import com.example.game.Player;
import com.example.strategy.CustomNumberSelectionStrategy;
import com.example.strategy.NumberSelectionStrategy;
import com.example.strategy.RandomNumberSelectionStrategy;

import java.util.Scanner;

/**
 * Classe principal para iniciar o jogo do Concurso de Beleza.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem-vindo ao Concurso de Beleza!");

        System.out.print("Quantos jogadores irão participar? ");
        int numberOfPlayers = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha

        Game game = new Game(3); // Número de rodadas

        for (int i = 1; i <= numberOfPlayers; i++) {
            System.out.print("Digite o nome do Jogador " + i + ": ");
            String playerName = scanner.nextLine();

            System.out.print("Escolha uma estratégia (1 - Aleatória, 2 - Personalizada): ");
            int choice = scanner.nextInt();
            NumberSelectionStrategy strategy;

            if (choice == 1) {
                strategy = new RandomNumberSelectionStrategy();
            } else {
                strategy = new CustomNumberSelectionStrategy(); // Passar apenas a estratégia
            }
            scanner.nextLine(); // Consumir a nova linha

            game.addPlayer(new Player(playerName, strategy));
        }

        // Iniciar o jogo
        game.start();

        // Determinar o vencedor
        Player winner = game.determineWinner();
        System.out.println("O vencedor é " + winner.getName() + " com o número " + winner.getChosenNumber() + "!");

        scanner.close();
    }
}