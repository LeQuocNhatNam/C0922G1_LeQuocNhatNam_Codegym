package com.example.validatesong.service;

import com.example.validatesong.model.Song;

import java.util.List;
import java.util.Optional;

public interface ISongService {
    List<Song> findAll();

    void save(Song song);

    Song findById(int id);
}
