package com.zerobase.aoppractice;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class UserTest {
    @Autowired
    private Store store;
    @Autowired
    private Library library;

    @Test
    public void test() {
        // Given
        User user = new User();

        // When & Then
        assertThat(user.greeting()).isEqualTo("hello");
    }

    @Test
    public void testVisitToStore() {
        // Given
        User user = new User();
        user.setName("스프링아카데미아");

//        Store store = new Store();
        store.setVisitCountByUser(11);

        // When
        user.visitTo(store);

        // Then
    }

    @Test
    public void testVisitToLibrary() {
        // Given
        User user = new User();
        user.setName("스프링아카데미아");

        library.setVisitCountByUser(11);

        // When
        user.visitTo(library);

        // Then
    }

}
