package com.educandoweb.course.repositories;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.entities.dtos.UserDTO;
import com.educandoweb.course.repositories.UserRepository;
import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@ActiveProfiles("test")
class UserRepositoryTest {

    @Autowired
    UserRepository repository;

    @Autowired
    EntityManager entityManager;

    @Test
    @DisplayName("Should get User successfully from DB")
    void findUserByNameCase1() {
        UserDTO data = new UserDTO("Victor", "victor@gmail.com", "995874587", "senha1234");
        createUser(data);
        Optional<User> foundedUser = this.repository.findUserByName("Victor");
        assertThat(foundedUser.isPresent()).isTrue();
    }

    @Test
    @DisplayName("Shouldn't get User when user not exists")
    void findUserByNameCase2() {
        Optional<User> foundedUser = this.repository.findUserByName("Victor");
        assertThat(foundedUser.isEmpty()).isTrue();
    }

    private User createUser(UserDTO userDTO) {
        User newUser = new User(userDTO);
        entityManager.persist(newUser);
        return newUser;
    }

}