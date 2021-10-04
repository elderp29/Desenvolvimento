package com.colecao.jogos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JogosController {
    @GetMapping("/teste")
    public String teste(){return "teste";}
}
