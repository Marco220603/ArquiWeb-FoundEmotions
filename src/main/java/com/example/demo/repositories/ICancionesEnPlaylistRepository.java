package com.example.demo.repositories;

import com.example.demo.entities.CancionesEnPlaylist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICancionesEnPlaylistRepository extends JpaRepository<CancionesEnPlaylist,Integer> {
}
