package com.knoldus.SpringBootintegrationwithSwagger2.service;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.knoldus.SpringBootintegrationwithSwagger2.repository.UserRepository;
import java.util.ArrayList;
import java.util.Optional;
import java.util.function.Consumer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.core.userdetails.User;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {UserService.class})
@ExtendWith(SpringExtension.class)
class UserServiceTest {
    @MockBean
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

    /**
     * Method under test: {@link UserService#getUser(Long)}
     */
    @Test
    void testGetUser() {
        com.knoldus.SpringBootintegrationwithSwagger2.model.User user = new com.knoldus.SpringBootintegrationwithSwagger2.model.User();
        user.setAddress("42 DS St");
        user.setEmail("shashi.knol@example.org");
        user.setId(123L);
        user.setPassword("Shashi56@");
        user.setUsername("shashi");
        Optional<com.knoldus.SpringBootintegrationwithSwagger2.model.User> ofResult = Optional.of(user);
        when(userRepository.findById((Long) any())).thenReturn(ofResult);
        Optional<com.knoldus.SpringBootintegrationwithSwagger2.model.User> actualUser = userService.getUser(123L);
        assertSame(ofResult, actualUser);
        assertTrue(actualUser.isPresent());
        verify(userRepository).findById((Long) any());
    }


    /**
     * Method under test: {@link UserService#deleteUser(Long)}
     */
    @Test
    void testDeleteUser() {
        doNothing().when(userRepository).deleteById((Long) any());
        userService.deleteUser(123L);
        verify(userRepository).deleteById((Long) any());
        assertTrue(userService.getAllUser().isEmpty());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link UserService}
     *   <li>{@link UserService#addUser(User)}
     *   <li>{@link UserService#updateUser(User)}
     * </ul>
     */
    @Test
    void testConstructor() {

        UserService actualUserService = new UserService();
        actualUserService.addUser(new User("username", "password", new ArrayList<>()));
        actualUserService.updateUser(new User("user", "pass", new ArrayList<>()));
    }
}

