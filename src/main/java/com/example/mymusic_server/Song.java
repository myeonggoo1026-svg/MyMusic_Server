package com.example.mymusic_server; // 본인의 실제 패키지명과 다르면 이 줄만 유지하세요.

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Getter
@Setter
@NoArgsConstructor  // 1. 필수: DB 데이터를 객체로 만들 때 쓰임 (500 에러 방지)
@AllArgsConstructor // 2. 선택: 모든 필드를 포함한 생성자
@Table(name = "songs") // 3. DB의 songs 테이블과 연결
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 4. DB의 AUTO_INCREMENT와 짝꿍
    private Integer id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String artist;

    @Column(name = "album_name") // 5. 중요: DB의 album_name을 자바의 albumName으로 매칭
    private String albumName;

    @Column(name = "album_artist")
    private String albumArtist;

    @Column(name = "release_year")
    private Integer releaseYear;

    private String genre;

    @Column(name = "disc_number")
    private Integer discNumber;

    @Column(name = "track_number")
    private Integer trackNumber;

    private String composer;
    private String lyricist;
}