package com.example.game;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private final List<Player> players;
    private final int totalRounds;

    public Game(int totalRounds) {
        this.players = new ArrayList<>();
        this.totalRounds = totalRounds;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void start() {
        for (int round = 1; round <= totalRounds; round++) {
            System.out.println("Rodada " + round + " começou!");
            playRound();
            checkRoundRules();
        }
    }

    private void playRound() {
        for (Player player : players) {
            player.selectNumber();
        }
        // Lógica para determinar o vencedor da rodada pode ser implementada aqui
    }

    private void checkRoundRules() {
        int playersLeft = players.size();
        // Implementar regras baseadas em "King of Diamonds"
        if (playersLeft <= 2) {
            System.out.println("Apenas " + playersLeft + " jogadores restantes!");
            // Adicionar lógica para o que acontece quando restam 2 jogadores
        }
        // Outras regras podem ser adicionadas aqui conforme necessário
    }

    public Player determineWinner() {
        // Lógica para determinar o vencedor da partida
        // Por enquanto, podemos retornar o primeiro jogador como exemplo
        return players.get(0);
    }
}