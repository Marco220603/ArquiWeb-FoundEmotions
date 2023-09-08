package com.example.demo.repositories;

import com.example.demo.entities.PlaylistdeCancionesEnUsuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPlaylistDeCancionesEnUsuariosRepository extends JpaRepository<PlaylistdeCancionesEnUsuarios,Integer> {
}
