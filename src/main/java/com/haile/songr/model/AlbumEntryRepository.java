package com.haile.songr.model;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AlbumEntryRepository extends JpaRepository<AlbumEntry, Long>{
    public List<AlbumEntry> findByTitle(String title);
}
