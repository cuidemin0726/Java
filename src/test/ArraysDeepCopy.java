package test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysDeepCopy {
    public static void main(String[] args) {

        int[] cards = {3,7,10,11,12};
//      int[] newCards = new int[5];

        //깊은 복사
        // copyOf(복사대상, 복사길이....)
        int[] newCards = Arrays.copyOf(cards, cards.length);
        System.out.println("복사후: " + Arrays.toString(newCards));

        cards[1] = 10;
        newCards[3] = 22;

        System.out.println("cards: " + Arrays.toString(cards));
        System.out.println("newCards: " + Arrays.toString(newCards));

    }
}
