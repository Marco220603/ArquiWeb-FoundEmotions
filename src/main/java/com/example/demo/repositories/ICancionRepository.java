package com.example.demo.repositories;

import com.example.demo.entities.Canciones;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICancionRepository extends JpaRepository<Canciones,Integer> {
}
