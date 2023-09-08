package com.example.demo.repositories;

import com.example.demo.entities.Temperamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITemperamentoRepository extends JpaRepository<Temperamento,Integer> {
}
