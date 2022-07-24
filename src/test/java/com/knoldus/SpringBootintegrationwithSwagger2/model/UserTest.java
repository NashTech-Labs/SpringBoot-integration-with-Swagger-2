package com.knoldus.SpringBootintegrationwithSwagger2.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class UserTest {
    /**
     * Method under test: {@link User#canEqual(Object)}
     */
    @Test
    void testCanEqual() {
        assertFalse((new User()).canEqual("Other"));
    }

    /**
     * Method under test: {@link User#canEqual(Object)}
     */
    @Test
    void testCanEqual2() {
        User user = new User();

        User user1 = new User();
        user1.setAddress("DS/A Main St");
        user1.setEmail("skt5doe@example.org");
        user1.setId(103L);
        user1.setPassword("password");
        user1.setUsername("username");
        assertTrue(user.canEqual(user1));
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link User#setAddress(String)}
     *   <li>{@link User#setEmail(String)}
     *   <li>{@link User#setId(Long)}
     *   <li>{@link User#setPassword(String)}
     *   <li>{@link User#setUsername(String)}
     * </ul>
     */
    @Test
    void testConstructor() {
        User actualUser = new User();
        actualUser.setAddress("43 Main road");
        actualUser.setEmail("knoldus@gmail.com");
        actualUser.setId(113L);
        actualUser.setPassword("password");
        actualUser.setUsername("username");
        String actualToStringResult = actualUser.toString();
        assertEquals("43 Main road", actualUser.getAddress());
        assertEquals("knoldus@gmail.com", actualUser.getEmail());
        assertEquals(113L, actualUser.getId().longValue());
        assertEquals("password", actualUser.getPassword());
        assertEquals("username", actualUser.getUsername());
        assertEquals("User(id=113, " +
                        "username=username, " +
                        "email=knoldus@gmail.com, " +
                        "password=password, " +
                        "address=43 Main road)",
                actualToStringResult);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link User#User(Long, String, String, String, String)}
     * </ul>
     */
    @Test
    void testConstructor2() {
        User actualUser = new User(103L, "shashi", "shashi.tanti@knoldus.com", "Skt56", "Main St");
        actualUser.setAddress("Main St");
        actualUser.setEmail("shashi.tanti@knoldus.com");
        actualUser.setId(103L);
        actualUser.setPassword("Skt56");
        actualUser.setUsername("shashi");
        String actualToStringResult = actualUser.toString();
        assertEquals("Main St", actualUser.getAddress());
        assertEquals("shashi.tanti@knoldus.com", actualUser.getEmail());
        assertEquals(103L, actualUser.getId().longValue());
        assertEquals("Skt56", actualUser.getPassword());
        assertEquals("shashi", actualUser.getUsername());
        assertEquals("User(id=103, " +
                        "username=shashi, " +
                        "email=shashi.tanti@knoldus.com, " +
                        "password=Skt56, " +
                        "address=Main St)",
                actualToStringResult);
    }

    /**
     * Method under test: {@link User#equals(Object)}
     */
    @Test
    void testEquals() {
        User user = new User();
        user.setAddress("42  St");
        user.setEmail("sona.doe@example.org");
        user.setId(123L);
        user.setPassword("Sona@56");
        user.setUsername("sona");
        assertNotEquals(user, null);
    }

    /**
     * Method under test: {@link User#equals(Object)}
     */
    @Test
    void testEquals2() {
        User user = new User();
        user.setAddress("56 Main St");
        user.setEmail("james.sam@example.org");
        user.setId(123L);
        user.setPassword("lol@158");
        user.setUsername("james");
        assertNotEquals(user, "Different type to User");
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link User#equals(Object)}
     *   <li>{@link User#hashCode()}
     * </ul>
     */
    @Test
    void testEquals3() {
        User user = new User();
        user.setAddress("42 Main St");
        user.setEmail("jane.doe@example.org");
        user.setId(123L);
        user.setPassword("iloveyou");
        user.setUsername("janedoe");
        assertEquals(user, user);
        int expectedHashCodeResult = user.hashCode();
        assertEquals(expectedHashCodeResult, user.hashCode());
    }

}

