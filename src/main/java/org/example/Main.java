package org.example;

import java.util.Scanner;

public class Main {
    public static String[] products = {"Хлеб", "Яблоки", "Молоко"};
    public static int[] prises = {40, 100, 90};
    public static Scanner scanner = new Scanner(System.in);
    public static int[] count = new int[products.length];
    public static int sumProducts = 0;

    public static void main(String[] args) {
        printMenu(products, prises);
        askProductAndCount();
        takeResult(products, prises, count, sumProducts);
    }

    public static String printMenu(String[] products, int[] prises) {
        StringBuilder result = new StringBuilder();
        if (products.length == prises.length) {
            for (int i = 0; i < products.length; i++) {
                result.append(i + 1 + "." + products[i] + " " + prises[i] + " руб/шт. \n");
            }
            String s = result.toString();
            System.out.println(result);
            return s;
        }
        return "Количество товаров не совпадает с количеством цен.";
    }

    public static void askProductAndCount() {
        while (true) {
            System.out.println("Выберите товар, введите номер товара и его количество через пробел или введите \"end\". для" +
                    "завершения операции и получения итоговой суммы");
            String inputString = scanner.nextLine();
            if (inputString.equals("end")) {
                break;
            }
            String[] parts = inputString.split(" ");
            if (Integer.parseInt(parts[0]) > 3) {
                System.out.println("Товара под номером " + parts + " несуществует!");
                continue;
            }
            int productNumber = Integer.parseInt(parts[0]) - 1;
            int productCount = Integer.parseInt(parts[1]);
            count[productNumber] += productCount;
            sumProducts += count[productNumber] * prises[productNumber];
        }
    }

    public static String takeResult(String[] products, int[] prises, int[] count, int sumProducts) {
        StringBuilder builder = new StringBuilder();
        System.out.println("Ваша корзина:");
        for (int i = 0; i < products.length; i++) {
            int cnt = count[i] * prises[i];
            if (count[i] != 0) {
                builder.append(products[i] + " " + count[i] + " шт. " + prises[i] + " руб/шт. " + cnt + " руб в сумме. \n");
            }
        }
        builder.append("итого " + sumProducts + " руб. \n");
        System.out.println(builder.toString());
        return builder.toString();
    }

}