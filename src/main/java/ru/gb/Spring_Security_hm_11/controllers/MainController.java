package ru.gb.Spring_Security_hm_11.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.gb.Spring_Security_hm_11.entities.User;
import ru.gb.Spring_Security_hm_11.services.UserService;

import java.security.Principal;

@RestController
@RequiredArgsConstructor
public class MainController {
    private final UserService userService;

    @GetMapping("/")
    public String homePage() {
        return "home";
    }

    @GetMapping("/unsecured")
    public String unsecuredPage() {
        return "unsecured";
    }

    @GetMapping("/auth_page")
    public String authenticatedPage() {
        return "authenticated";
    }
    @GetMapping("/admin")
    public String adminPage(){
        return "admin";
    }

    @GetMapping("/user_info")
    public String daoUserInfo (Principal principal){
        User user = userService.findByUsername(principal.getName())
                .orElseThrow(() -> new RuntimeException("Unable to find user by username" + principal.getName()));
        return "Authenticated user info: username - " + user.getUsername() + ", email - " + user.getEmail();
    }
}
