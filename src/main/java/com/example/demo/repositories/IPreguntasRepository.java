package com.example.demo.repositories;

import com.example.demo.entities.Preguntas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPreguntasRepository extends JpaRepository<Preguntas,Integer> {
}
