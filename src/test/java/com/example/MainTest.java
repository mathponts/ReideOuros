package com.example;

import com.example.game.Game;
import com.example.game.Player;
import com.example.strategy.RandomNumberSelectionStrategy; // Importar a estratégia

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MainTest {
    @Test
    public void testGameCreation() {
        Game game = new Game(5);

        // Usar uma estratégia para criar jogadores
        Player player1 = new Player("Jogador 1", new RandomNumberSelectionStrategy());
        Player player2 = new Player("Jogador 2", new RandomNumberSelectionStrategy());

        game.addPlayer(player1);
        game.addPlayer(player2);

        assertNotNull(game);
    }
}