package com.example.mymusic_server;

import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;
import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "*") // 브라우저 차단 방지
public class SongController {

    private final SongRepository songRepository;

    // 클래스 위에 RequestMapping을 빼고, 여기에 바로 주소를 적는게 가장 확실합니다.
    @GetMapping("/songs")
    public List<Song> getAllSongs() {
        return songRepository.findAll();
    }
}