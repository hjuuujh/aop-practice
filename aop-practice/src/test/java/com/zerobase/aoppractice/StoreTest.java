package com.zerobase.aoppractice;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
public class StoreTest {
    @Autowired
    private Store store;

    @Autowired
    private Library library;

    @Test
    public void test() {
        // Given
//        Store store = new Store();

        // When & Then
        assertThat(store.getOperationTime()).isEqualTo("AM 08:00 ~ PM 08:00");
    }

    @Test
    public void testVisitToStore() {
        // Given
        User user = new User();
        user.setName("스프링아카데미아");

        store.setVisitCountByUser(11);


        // When & Then
        user.visitTo(store);
    }

    @Test
    public void testVisitToLibrary() {
        // Given
        User user = new User();
        user.setName("스프링아카데미아");

        library.setVisitCountByUser(11);


        // When & Then
        user.visitTo(store);
    }

    @Test
    public void isVIPUser() {
        // Given
        Store store = new Store();
        store.setVisitCountByUser(11);

        // When
        boolean result = store.isVIP(new User());

        // Then
        assertThat(result).isTrue();
    }
}