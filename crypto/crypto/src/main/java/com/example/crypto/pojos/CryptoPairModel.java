package com.example.crypto.pojos;

public class CryptoPairModel {
    private String firstCrypto; //название валюты её айди для поиска
    private String firstExchange; //обменник
    private String firstIcon;
    private Double firstPrice;
    private Double firstAmount;
    private String firstBank;

    private String secondCrypto;
    private String secondExchange;
    private String secondIcon;
    private Double secondPrice;
    private Double secondAmount;
    private String secondBank;


    private Double priceDiff;

//get CRYPTO/ALL
//get


    public CryptoPairModel(String firstCrypto, String firstExchange, String firstIcon, Double firstPrice, Double firstAmount, String firstBank,
                            String secondExchange, Double secondPrice, Double secondAmount, Double priceDiff, String secondBank) {
        this.firstCrypto = firstCrypto;
        this.firstExchange = firstExchange;
        this.firstIcon = firstIcon;
        this.firstPrice = firstPrice;
        this.firstAmount = firstAmount;
        this.firstBank = firstBank;

        this.secondCrypto = firstCrypto;
        this.secondExchange = secondExchange;
        this.secondIcon = firstIcon;
        this.secondPrice = secondPrice;
        this.secondAmount = secondAmount;
        this.priceDiff = priceDiff;
        this.secondBank = secondBank;
    }

    @Override
    public String toString() {
        return "CryptoPairModel{" +
                "firstCrypto='" + firstCrypto + '\'' +
                ", firstExchange='" + firstExchange + '\'' +
                ", firstIcon='" + firstIcon + '\'' +
                ", firstPrice=" + firstPrice +
                ", firstAmount=" + firstAmount +
                ", firstBank='" + firstBank + '\'' +
                ", secondCrypto='" + secondCrypto + '\'' +
                ", secondExchange='" + secondExchange + '\'' +
                ", secondIcon='" + secondIcon + '\'' +
                ", secondPrice=" + secondPrice +
                ", secondAmount=" + secondAmount +
                ", secondBank='" + secondBank + '\'' +
                ", priceDiff=" + priceDiff +
                '}';
    }
}
