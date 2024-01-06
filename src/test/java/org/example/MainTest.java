package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    void printMenu() {
        final String[] argumentProduct = {"Хлеб"};
        final int[] argumentPrice = {40};
        final String expected = "1.Хлеб 40 руб/шт. \n";

        final String result = Main.printMenu(argumentProduct, argumentPrice);

        Assertions.assertEquals(expected, result);
    }
}