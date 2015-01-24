package com.malotor;


public class PokerGame {

    public int resolve(String[] hands) {

        int highNumber = 0;
        int winner = 0;
        int currentPlayer = 1;

        for (String card : hands) {
            char number = card.charAt(0);
            //char number = card.charAt(0);
            if (number > highNumber ) {
                highNumber = number;
                winner = currentPlayer;
            }
            currentPlayer++;
        }

        return winner;
    }
}
