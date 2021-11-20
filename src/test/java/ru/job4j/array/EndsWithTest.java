package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class EndsWithTest {
    @Test
    public void whenEndWithPrefixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'o'};
        boolean result = EndsWith.endsWith(word, post);
        Assert.assertTrue(result);
    }

    @Test
    public void whenNotEndWithPrefixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'a'};
        boolean result = EndsWith.endsWith(word, post);
        Assert.assertFalse(result);
    }

    @Test
    public void whenEndWithPrefixThenTrue1() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'l', 'o'};
        boolean result = EndsWith.endsWith(word, post);
        Assert.assertTrue(result);
    }

    @Test
    public void whenEndWithPrefixThenTrue2() {
        char[] word = {'H', 'e', 'l', 'l', 'o', '1', '6'};
        char[] post = {'l', 'l', 'o', '1', '6'};
        boolean result = EndsWith.endsWith(word, post);
        Assert.assertTrue(result);
    }

    @Test
    public void whenNotEndWithPrefixThenFalse1() {
        char[] word = {'H', 'e', 'l', 'l', 'o', '1', '6'};
        char[] post = {'l', 'l', 'o', '2', '6'};
        boolean result = EndsWith.endsWith(word, post);
        Assert.assertFalse(result);
    }
}