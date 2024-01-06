package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest2 {

    @Test
    void takeResult() {
        final String[] argumentProduct = {"Картошка"};
        final int[] argumentPrice = {5};
        final int[] argumentCount = {1};
        final int argumentSumProducts = 5;
        final String expected = "Картошка 1 шт. 5 руб/шт. 5 руб в сумме. \n" +
                "итого 5 руб. \n";

        Main.printMenu(argumentProduct, argumentPrice);
        final String result = Main.takeResult(argumentProduct, argumentPrice, argumentCount, argumentSumProducts);

        Assertions.assertEquals(expected, result);
    }
}