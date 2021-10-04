package com.colecao.jogos.repository;


import com.colecao.jogos.model.Jogo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface JogosRepository extends JpaRepository<Jogo,Long> {


}
