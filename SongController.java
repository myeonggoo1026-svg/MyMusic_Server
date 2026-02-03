package com.example.mymusic_server;

import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;
import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "*") // 브라우저 차단 방지
public class SongController {

    private final SongRepository songRepository;
    @GetMapping("/songs")
    public List<Song> getAllSongs() {
        return songRepository.findAll();
    }
}