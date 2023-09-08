package com.example.demo.repositories;

import com.example.demo.entities.LikesCancione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILikesCancionesRepository extends JpaRepository<LikesCancione,Integer> {
}
