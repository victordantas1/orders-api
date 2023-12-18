package com.educandoweb.course.services;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.entities.dtos.UserDTO;
import com.educandoweb.course.services.UserService;
import com.educandoweb.course.services.exceptions.ResourceAlreadyExistsException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class UserServiceTest {

    @Autowired
    UserService service;

    @Test
    @DisplayName("should throw exception when insert user which already exists")
    void insertCase1() {
        UserDTO user = new UserDTO("victor", "victor@gmail.com", "995033476", "123456");
        service.insert(user);
        Assertions.assertThrows(ResourceAlreadyExistsException.class, () -> service.insert(user));
    }

    @Test
    @DisplayName("should insert successfully user")
    void insertCase2() {
        UserDTO user = new UserDTO("emmily", "emmily@gmail.com", "995033476", "123456");
        User userInserted = service.insert(user);
        assertThat(service.findById(userInserted.getId()).getEmail()).isEqualTo(user.email());

    }





}