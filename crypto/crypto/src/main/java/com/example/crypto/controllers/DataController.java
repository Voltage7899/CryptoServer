package com.example.crypto.controllers;

import com.example.crypto.generators.CryptoPairGenerator;
import com.example.crypto.pojos.CryptoPairModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pair")
public class DataController {

    @GetMapping("/all")
    List<CryptoPairModel> getAllCryptoPair(){
        return CryptoPairGenerator.generateMultiple();
    }

    @GetMapping("/all/{id}")
    CryptoPairModel getAllCryptoPair(@PathVariable String id){
        return CryptoPairGenerator.generateSingle(id);
    }


}
