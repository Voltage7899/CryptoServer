package com.example.crypto.generators;

import com.example.crypto.pojos.CryptoPairModel;
import com.example.crypto.pojos.CryptoParts;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CryptoPairGenerator {

    final static CryptoParts[] cryptoParts = {new CryptoParts("valuta1", "icon1"), new CryptoParts("valuta2", "icon2"),
            new CryptoParts("valuta3", "icon3"), new CryptoParts("valuta4", "icon4"),
            new CryptoParts("valuta5", "icon5"), new CryptoParts("valuta6", "icon6"),
            new CryptoParts("valuta7", "icon7"), new CryptoParts("valuta8", "icon8"),
            new CryptoParts("valuta9", "icon9"), new CryptoParts("valuta10", "icon10")};

    final static String[] banks = {"bank1", "bank2", "bank3", "bank4", "bank5"};
    final static String[] exchangers = {"ex1", "ex2", "ex3", "ex4", "ex5", "ex6", "ex7", "ex8"};

    public static CryptoPairModel generateSingle(String name) {
        Double firstPrice = generatePrice(name);
        Double secondPrice = Math.random() * generatePrice(name);

        Double priceDiff = firstPrice - secondPrice;

        Double firstAmount = 20 + Math.random() * (100 - 10);
        Double secondAmount =  100 + Math.random() * (100 - 10);

        String firstBank = banks[(int) (Math.random() * 5)];
        String secondBank = banks[(int) (Math.random() * 5)];

        int turn = (int) (Math.random() * 8);
        String firstExchange = exchangers[turn];
        int nextTurn = (int) (Math.random() * 8);
        while (nextTurn == turn) {
            nextTurn = (int) (Math.random() * 8);
        }
        String secondExchange = exchangers[nextTurn];
        List<CryptoParts> names = Arrays.stream(cryptoParts).toList();

        String firstCrypto = names.stream()
                .filter(x -> x.getCrypto().equals(name))
                .map(CryptoParts::getCrypto)
                .findFirst()
                .get();
        String firstIcon = names.stream()
                .filter(x -> x.getCrypto().equals(name))
                .map(CryptoParts::getIcon)
                .findFirst()
                .get();

        return new CryptoPairModel(firstCrypto, firstExchange, firstIcon, firstPrice, firstAmount, firstBank,
                secondExchange, secondPrice, secondAmount, priceDiff, secondBank);

    }

    public static List<CryptoPairModel> generateMultiple() {
        return Arrays.stream(cryptoParts)
                .map(CryptoParts::getCrypto)
                .toList()
                .stream()
                .map(CryptoPairGenerator::generateSingle)
                .collect(Collectors.toList());
    }


    static double generatePrice(String name) {
        return switch (name) {
            case "valuta1" -> 100 + Math.random() * (100 - 10);
            case "valuta2" -> 200 + Math.random() * (200 - 10);
            case "valuta3" -> 300 + Math.random() * (300 - 10);
            case "valuta4" -> 400 + Math.random() * (400 - 10);
            case "valuta5" -> 500 + Math.random() * (500 - 10);
            case "valuta6" -> 600 + Math.random() * (600 - 10);
            case "valuta7" -> 700 + Math.random() * (700 - 10);
            case "valuta8" -> 800 + Math.random() * (800 - 10);
            case "valuta9" -> 900 + Math.random() * (900 - 10);
            case "valuta10" -> 1000 + Math.random() * (1000 - 10);
            default -> 1111 + Math.random() * (1111 - 10);
        };
    }


}
