package com.colecao.jogos.service;

import com.colecao.jogos.exception.JogosNotFoundException;
import com.colecao.jogos.model.Jogo;
import com.colecao.jogos.repository.JogosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JogosService {
    @Autowired
    private JogosRepository repository;

    public List<Jogo> findAll() {
        return repository.findAll();
    }

    public Jogo findById(Long id) {
        final Optional<Jogo> jogo = repository.findById(id);

        if(jogo.isPresent()) {
            return jogo.get();
        }else{
            throw new JogosNotFoundException();
        }
    }

    public Jogo save(Jogo jogo) {
        return repository.save(jogo);
    }

    public Jogo updateJogo(Long id, Jogo jogoAlterado) {

        final Optional<Jogo> jogoSalvo = repository.findById(id);
        final Jogo jogo;


        if(jogoSalvo.isPresent()) {
            jogo = jogoSalvo.get();
        }else{
            throw new JogosNotFoundException();
        }

        jogo.setNome(jogoAlterado.getNome());
        jogo.setGenero(jogoAlterado.getGenero());
        jogo.setTipo(jogoAlterado.getTipo());

        return repository.save(jogo);
    }

    public void deleteJogo(Long id) {

        final Jogo jogoSalvo = findById(id);

        repository.delete(jogoSalvo);

    }
}
