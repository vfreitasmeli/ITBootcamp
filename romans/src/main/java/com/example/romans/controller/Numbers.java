package com.example.romans.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Camada de controller REST
@RequestMapping("/romans")
public class Numbers {
    Conversor result = new Conversor();



    @GetMapping ("/{number}")// HTTP GET
    public String sayHello(@PathVariable int number) {
        if (number == 0) {
            return "Não existe o número zero (0) em algarismos romanos";
        }
        return result.conversor(number);
    }
}
