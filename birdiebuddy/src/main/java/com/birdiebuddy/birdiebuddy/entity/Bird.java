package com.birdiebuddy.birdiebuddy.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="birds_data")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Bird {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="bird_id")
    private Long id;

    @OneToMany(mappedBy = "birds_data", cascade = CascadeType.ALL)
    private List<Bird_habitat> habitats;
    private String name; //새이름
    private String habitat; //서식지
    private int size; //사이즈
    private String image; //이미지
    private String scien_name; //학명
    private String eng; //영명
    private String classed; //분류
    private String content; //설명
    private int size_tag; //사이즈 태그



}
