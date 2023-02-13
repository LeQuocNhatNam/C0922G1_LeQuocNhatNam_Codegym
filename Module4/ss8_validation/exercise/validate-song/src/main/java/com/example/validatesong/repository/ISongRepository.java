package com.example.validatesong.repository;

import com.example.validatesong.model.Song;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISongRepository extends JpaRepository<Song,Integer> {
    Page<Song> findByNameContaining(String name, Pageable pageable);
}
