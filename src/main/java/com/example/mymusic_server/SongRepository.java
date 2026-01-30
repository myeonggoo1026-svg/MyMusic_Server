package com.example.mymusic_server;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<Song, Integer> {
    // 데이터 조회 기능
}