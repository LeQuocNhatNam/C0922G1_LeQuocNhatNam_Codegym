package com.example.validatesong.service;

import com.example.validatesong.model.Song;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface ISongService {
    List<Song> findAll();

    void save(Song song);

    Song findById(int id);

    Page<Song> search(String name, Pageable pageable);

}
