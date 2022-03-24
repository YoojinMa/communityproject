package com.community.communityProject.config.auth;

import com.community.communityProject.domain.User;
import lombok.Getter;

import java.io.Serializable;

@Getter
public class SessionUser implements Serializable {

    private String name, email, picture;

    public SessionUser(User user) {
        this.name = user.getName();
        this.email = user.getEmail();
    }

}
