package com.zerobase.aoppractice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class UserTest {
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

        Store store = new Store();


        // When
        user.visitTo(store);

        // Then
    }

}
