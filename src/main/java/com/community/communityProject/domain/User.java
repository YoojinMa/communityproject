package com.community.communityProject.domain;

import javax.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.persistence.Id;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String nickname;

    @NotNull
    private String email;

    @NotNull
    private Role role;

    @Builder
    public User(String nickname, String email, Role role) {
        this.nickname = nickname;
        this.email = email;
        this.role = role;
    }

    public User update(String name) {
        this.nickname = nickname;

        return this;
    }

    public String getRoleKey() {
        return this.role.getKey();
    }

}
