package com.example.demo.repositories;

import com.example.demo.entities.Artista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IArtistaRepository extends JpaRepository<Artista,Integer> {
}
