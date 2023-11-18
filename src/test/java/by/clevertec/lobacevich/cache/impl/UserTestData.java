package by.clevertec.lobacevich.cache.impl;

import by.clevertec.lobacevich.entity.User;

import java.time.LocalDate;

public class UserTestData {

    public static User getUser1() {
        return User.builder()
                .id(1)
                .firstname("Alex")
                .lastname("Murfhy")
                .dateOfBirth(LocalDate.of(1997, 05, 17))
                .email("1234@gmail.com")
                .build();
    }

    public static User getUser2() {
        return User.builder()
                .id(2)
                .firstname("Nick")
                .lastname("Smith")
                .dateOfBirth(LocalDate.of(1990, 02, 27))
                .email("1235@gmail.com")
                .build();
    }

    public static User getUser3() {
        return User.builder()
                .id(3)
                .firstname("Mike")
                .lastname("Carter")
                .dateOfBirth(LocalDate.of(2001, 12, 06))
                .email("1236@gmail.com")
                .build();
    }

    public static User getUser4() {
        return User.builder()
                .id(4)
                .firstname("Bob")
                .lastname("Bond")
                .dateOfBirth(LocalDate.of(1980, 07, 02))
                .email("1237@gmail.com")
                .build();
    }
}
