package com.example.demo.repositories;

import com.example.demo.entities.CompartirPlaylist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICompartirPlaylistRepository extends JpaRepository<CompartirPlaylist,Integer> {
}
