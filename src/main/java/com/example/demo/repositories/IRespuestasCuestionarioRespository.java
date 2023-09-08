package com.example.demo.repositories;

import com.example.demo.entities.RespuestasCuestionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRespuestasCuestionarioRespository extends JpaRepository<RespuestasCuestionario,Integer> {
}
