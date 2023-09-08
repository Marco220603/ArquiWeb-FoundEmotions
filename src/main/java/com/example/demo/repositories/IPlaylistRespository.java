package com.example.demo.repositories;

import com.example.demo.entities.Playlist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPlaylistRespository extends JpaRepository<Playlist,Integer> {
}
