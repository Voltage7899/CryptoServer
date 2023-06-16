package com.example.crypto.generators;

import com.example.crypto.pojos.CryptoPairModel;
import com.example.crypto.pojos.CryptoParts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class KirilGenerator {
    public static List<CryptoPairModel> generateMultiple() {
        List<CryptoPairModel> returnedList = new ArrayList<>();
//      первый объект из списка ETH/USDT
        double firstPrice = 100 + Math.random() * (100 - 10);
        double firstAmount = 100 + Math.random() * (100 - 10);

        double secondPrice = 0.9 * (100 + Math.random() * (100 - 10));
        double secondAmount = 100 + Math.random() * (100 - 10);

        double priceDiff = firstPrice - secondPrice;
        returnedList.add(new CryptoPairModel("ETH/USDT", "Binance", "ETH", firstPrice, firstAmount, "tinkoff",
                "ETH/USDT", "BYBIT", "ETH", secondPrice, secondAmount, "tinkoff", priceDiff));
//      второй объект меняешь формулы как хочешь
        firstPrice = 100 + Math.random() * (100 - 10);
        firstAmount = 100 + Math.random() * (100 - 10);

        secondPrice = 0.9 * (100 + Math.random() * (100 - 10));
        secondAmount = 100 + Math.random() * (100 - 10);

        priceDiff = firstPrice - secondPrice;

        returnedList.add(new CryptoPairModel("BTC/USDT", "Binance", "BTC", firstPrice, firstAmount, "tinkoff",
                "BTC/USDT", "BYBIT", "BTC", secondPrice, secondAmount, "tinkoff", priceDiff));

        //третий объект меняешь формулы как хочешь
        firstPrice = 100 + Math.random() * (100 - 10);
        firstAmount = 100 + Math.random() * (100 - 10);

        secondPrice = 0.9 * (100 + Math.random() * (100 - 10));
        secondAmount = 100 + Math.random() * (100 - 10);

        priceDiff = firstPrice - secondPrice;

        returnedList.add(new CryptoPairModel("BNB/USDT", "Binance", "BNB", firstPrice, firstAmount, "tinkoff",
                "BNB/USDT", "BYBIT", "BNB", secondPrice, secondAmount, "tinkoff", priceDiff));

        return returnedList;
    }

    public static CryptoPairModel getOne(String cryptoName){
        return KirilGenerator.generateMultiple().stream()
                .filter(x -> x.getFirstCrypto().equals(cryptoName))
                .findFirst()
                .get();
    }
}
