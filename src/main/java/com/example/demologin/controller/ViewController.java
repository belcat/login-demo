package com.example.demologin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Controller
public class ViewController {

    @GetMapping("/")
    public String home(HttpSession session, Model model) {
        model.addAttribute("user", session.getAttribute("user"));
        return "home";
    }

    @GetMapping("/login")
    public String login(HttpSession session, Model model) {
        // 로그인 했으면 홈으로
        if (isLogin(session)) return "redirect:/";
        model.addAttribute("user", session.getAttribute("user"));
        return "login";
    }

    @GetMapping("/change")
    public String changeNickname(HttpSession session, Model model) {
        // 로그인 안했으면 홈으로
        if (!isLogin(session)) return "redirect:/";
        model.addAttribute("user", session.getAttribute("user"));
        return "user/change";
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        // 세션에서 유저 지우고 홈으로 리다이렉트
        session.removeAttribute("user");
        return "redirect:/";
    }

    private boolean isLogin(HttpSession session) {
        // 세션에 유저정보가 없으면 로그인 안한거겠지
        return session.getAttribute("user") != null;
    }
}
