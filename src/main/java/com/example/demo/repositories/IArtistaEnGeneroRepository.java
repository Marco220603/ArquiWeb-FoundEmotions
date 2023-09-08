package com.example.demo.repositories;

import com.example.demo.entities.ArtistaEnGenero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IArtistaEnGeneroRepository extends JpaRepository<ArtistaEnGenero,Integer> {
}
