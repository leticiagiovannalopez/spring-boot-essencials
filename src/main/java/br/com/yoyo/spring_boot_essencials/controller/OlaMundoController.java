package br.com.yoyo.spring_boot_essencials.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Anotações da classe: valem para todos os métodos daqui
@RestController                  // a classe atende requisições HTTP
@RequestMapping("/v1/ola-mundo") // endereço base da classe
public class OlaMundoController {

    // Anotação do método: vale só para ele
    @GetMapping                  // GET em /v1/ola-mundo (endereço da classe + nada)
    public String olaMundo() {   // o Spring chama este método quando a requisição chega
        return "Ola Mundo";      // texto devolvido na resposta
    }
}