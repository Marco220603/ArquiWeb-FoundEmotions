package com.example.demo.repositories;

import com.example.demo.entities.ResultadoCuestionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IResultadoCuestionarioRepository extends JpaRepository<ResultadoCuestionario,Integer> {
}
