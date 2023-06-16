package com.example.crypto.pojos;

import lombok.Getter;

public class CryptoPairModel {
    @Getter
    private String firstCrypto; //название валюты её айди для поиска
    @Getter
    private String firstExchange; //обменник
    @Getter
    private String firstIcon;
    @Getter
    private Double firstPrice;
    @Getter
    private Double firstAmount;
    @Getter
    private String firstBank;

    @Getter
    private String secondCrypto;
    @Getter
    private String secondExchange;
    @Getter
    private String secondIcon;
    @Getter
    private Double secondPrice;
    @Getter
    private Double secondAmount;
    @Getter
    private String secondBank;


    @Getter
    private Double priceDiff;

//get CRYPTO/ALL
//get


    public CryptoPairModel() {
    }

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

    public CryptoPairModel(String firstCrypto, String firstExchange, String firstIcon, Double firstPrice, Double firstAmount, String firstBank,
                           String secondCrypto, String secondExchange, String secondIcon, Double secondPrice, Double secondAmount, String secondBank, Double priceDiff) {
        this.firstCrypto = firstCrypto;
        this.firstExchange = firstExchange;
        this.firstIcon = firstIcon;
        this.firstPrice = firstPrice;
        this.firstAmount = firstAmount;
        this.firstBank = firstBank;
        this.secondCrypto = secondCrypto;
        this.secondExchange = secondExchange;
        this.secondIcon = secondIcon;
        this.secondPrice = secondPrice;
        this.secondAmount = secondAmount;
        this.secondBank = secondBank;
        this.priceDiff = priceDiff;
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
