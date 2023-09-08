package com.example.demo.repositories;

import com.example.demo.entities.PlaylistEnUsuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface IPlaylistEnUsuarioRepository extends JpaRepository<PlaylistEnUsuarios,Integer> {
}
