package com.naver.campushackday.contentsproxyblog.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "GITHUB_URL")
    private String githubUrl;

    @Transient
    private String content;

    public Post() {
    }

    private Post(Long id, String title, String githubUrl) {
        this.id = id;
        this.title = title;
        this.githubUrl = githubUrl;
    }

    public Post(String title, String githubUrl) {
        this(0L, title, githubUrl);
    }


}
