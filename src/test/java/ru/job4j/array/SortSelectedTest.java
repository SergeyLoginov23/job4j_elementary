package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort3() {
        int[] data = new int[] {33, 14, 151};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {14, 33, 151};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort7() {
        int[] data = new int[] {33, 14, 151, 1, 54, 88, 250};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 14, 33, 54, 88, 151, 250};
        assertThat(result).containsExactly(expected);
    }
}