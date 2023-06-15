package com.example.crypto.pojos;

import lombok.Getter;

public class CryptoParts {
    @Getter
    private String Crypto; //название валюты её айди для поиска
//    private String Exchange; //обменник

    @Getter
    private String Icon;
//    private String Bank;

    public CryptoParts(String crypto, String icon) {
        Crypto = crypto;
        Icon = icon;
    }
}
