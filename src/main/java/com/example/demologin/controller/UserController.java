package com.example.demologin.controller;

import com.example.demologin.dto.User;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/users")
public class UserController {

    @PostMapping("/authentication")
    public User authenticateUser(HttpSession session, @RequestBody User user) {
        // 일단 john 입력하면 로그인 되었다고 치자
        if (!"john".equals(user.getNickname())) throw new IllegalArgumentException();
        user.setId(1);
        session.setAttribute("user", user);
        return user;
    }

    @GetMapping("/session")
    public Object authenticateUser(HttpSession session) {
        // 현재 세션에 있는 유저를 리턴
        return session.getAttribute("user");
    }

    @PutMapping("/{id}")
    public User updateNickname(HttpSession session, @PathVariable int id, @RequestBody User user) {
        // DB에 해당 id의 유저 업데이트.. 겠지만 일단 그냥 세션에 바로 업데이트만 하는걸로
        session.setAttribute("user", user);
        return user;
    }
}
