package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {
    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax5To4Then5() {
        int left = 5;
        int right = 4;
        int result = Max.max(left, right);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax3To3Then3() {
        int left = 3;
        int right = 3;
        int result = Max.max(left, right);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax4To5To6Then6() {
        int first = 4;
        int second = 5;
        int third = 6;
        int result = Max.max(first, second, third);
        int expected = 6;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax4To5To6To1Then6() {
        int first = 4;
        int second = 5;
        int third = 6;
        int fourth = 1;
        int result = Max.max(first, second, third, fourth);
        int expected = 6;
        assertThat(result).isEqualTo(expected);
    }

}