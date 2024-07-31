package com.zerobase.aoppractice;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
public class LibraryTest {
    @Autowired
    private Library library;

    @Test
    public void test() {
        //given
        Library library = new Library();
        library.setName("행복 도서관");

        //when
        String result = library.getName();

        //then
        assertThat(result).isNotNull();
        assertThat(result).isEqualTo("행복 도서관");
    }

    @Test
    public void testVisitedBy() {
        //given
        library.setName("행복 도서관");

        User user = new User();
        user.setName("스프링");

        //when
        library.visitedBy(user);

        //then
    }
}