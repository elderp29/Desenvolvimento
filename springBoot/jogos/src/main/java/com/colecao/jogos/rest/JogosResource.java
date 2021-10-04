package com.colecao.jogos.rest;

import com.colecao.jogos.model.Jogo;
import com.colecao.jogos.service.JogosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class JogosResource {

    @Autowired
    private JogosService jogosService;

    @GetMapping("/api/jogo")
    public List<Jogo> getAllJogo(){

        return jogosService.findAll();
    }

    @GetMapping("/api/jogo/{id}")
    public ResponseEntity<Jogo> getJogo(@PathVariable("id") Long  id){
        final Jogo jogo = jogosService.findById(id);
        return ResponseEntity.ok(jogo);
    }

    @PostMapping("/api/jogo/")
    @ResponseStatus(HttpStatus.CREATED)
    public Jogo createJogo(@Valid @RequestBody Jogo jogo){

        return jogosService.save(jogo);
    }

    @PutMapping("/api/jogo/{id}")
    public ResponseEntity<Jogo>  updateJogo(@PathVariable("id") Long  id, @Valid @RequestBody Jogo jogoAlterado){

        return ResponseEntity.ok(jogosService.updateJogo(id, jogoAlterado));
    }

    @DeleteMapping("/api/jogo/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void  deleteJogo(@PathVariable("id") Long  id){

        jogosService.deleteJogo(id);

    }
}
