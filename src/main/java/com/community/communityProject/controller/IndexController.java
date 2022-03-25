package com.community.communityProject.controller;

import com.community.communityProject.config.oauth.LoginUser;
import com.community.communityProject.config.oauth.SessionUser;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@RequiredArgsConstructor
@Controller
public class IndexController {

    private final HttpSession httpSession;

    @GetMapping("/")
    public String index(Model model, @LoginUser SessionUser user) {

        if(user != null){
            model.addAttribute("userName",user.getName());
        }

        return "index";

    }

}
