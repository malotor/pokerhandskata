package com.malotor;

import java.lang.String;
/**
 * Created by manel on 10/02/15.
 */
public class CardFactory {
    public static create(String stringcard) {
        char c = stringcard.charAt(0);
        Integer number;

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

        String suit = stringcard.charAt(1);

        return new Card(number, suit);
    }
}
