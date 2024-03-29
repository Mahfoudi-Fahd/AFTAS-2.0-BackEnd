package com.example.aftas.seeders;


import com.example.aftas.domain.Member;
import com.example.aftas.domain.Role;
import com.example.aftas.repository.UserRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class UserSeeder {
    private final UserRepository userRepository;

    public void run(String... args) {
        if (userRepository.count() == 0) {
            seedUsers();
        }
    }
    public void seedUsers() {
        List<Member> users = List.of(
                Member.builder()
                        .firstName("FAHD")
                        .lastName("FAHD")
                        .email("fahd@fahd.com")
                        .password("123456")
                        .role(Role.builder().id(2L).build())
                        .build(),
                Member.builder()
                        .firstName("User")
                        .lastName("User")
                        .email("user@user.com")
                        .password("123456")
                        .role(Role.builder().id(1L).build())
                        .build()
        );
        userRepository.saveAll(users);
    }
}
