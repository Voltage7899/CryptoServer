package com.example.crypto.controllers;

import com.example.crypto.generators.CryptoPairGenerator;
import com.example.crypto.generators.KirilGenerator;
import com.example.crypto.pojos.CryptoPairModel;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pair")
public class DataController {

    @GetMapping("/all")
    public List<CryptoPairModel> getAllCryptoPair(){
        return KirilGenerator.generateMultiple();
    }

    @GetMapping("/all/")
    public CryptoPairModel getAllCryptoPair(@RequestParam String id){
        return KirilGenerator.getOne(id);
    }


}
