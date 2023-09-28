package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
//teste github
@RestController
@RequestMapping("/exercicio-01")
public class HelloWolrdController {

    @GetMapping("/hello-world")
    public String hello(){
        return "Hello, World!!";
    }
    @GetMapping("/bsm")
    public String bsm(){
        return("Persistência\n" +
                "Mentalidade de Crescimento\n" +
                "Orientação ao Futuro\n" +
                "Responsabilidade Pessoal\n" +
                "Trabalho em Equipe\n" +
                "Comunicação\n" +
                "Orientação aos Detalhes\n" +
                "Proatividade");
    }
    @GetMapping("/objetivos")
    public ArrayList<String> obj(){

        return(new ArrayList<>(List.of("Quero melhorar minhas habilidades em: ",
                "Trabalho em Equipe\n" ,
                "Comunicação\n",
                "Orientação aos Detalhes\n",
                "Proatividade")));
    }


}
