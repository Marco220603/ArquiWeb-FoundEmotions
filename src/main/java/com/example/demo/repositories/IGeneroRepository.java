package com.example.demo.repositories;

import com.example.demo.entities.Genero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IGeneroRepository extends JpaRepository<Genero,Integer> {
}
