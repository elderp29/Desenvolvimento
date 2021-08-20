package com.base.colecaoJogos.repository;

import com.base.colecaoJogos.model.Jogo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class JogoRepository {

    public List<Jogo> getAllJogo(){

        final List<Jogo> jogo = new ArrayList<Jogo>();
        jogo.add(new Jogo(1, "GTA","Console","mundo aberto"));

        return jogo;
    }
}
