package com.example.memberproject.domain;

public class Member {
    private Long id; // 데이터 구분을 위해 system이 저장하는 id
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
