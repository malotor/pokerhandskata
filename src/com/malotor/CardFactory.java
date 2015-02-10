package com.malotor;

import java.lang.String;

public class CardFactory {
    public static Card create(String stringcard) {

        char c = stringcard.charAt(0);
        char suit = stringcard.charAt(1);

        int number;
        switch (c) {
            case 'T': number = 10; break;
            case 'J': number = 11; break;
            case 'Q': number = 12; break;
            case 'K': number = 13; break;
            case 'A': number = 14; break;
            default:
                number =  Character.getNumericValue(c);
                break;
        }
        return new Card(number, suit);
    }
}
