package ru.dataart.academy.java;

import org.junit.jupiter.api.Test;

public class ReverseIntegerTest {

    @Test
    public void test() {
        assert (ReverseInteger.reverse(123) == 321);
        assert (ReverseInteger.reverse(-123) == -321);
        assert (ReverseInteger.reverse(0) == 0);
        assert (ReverseInteger.reverse(1) == 1);
        assert (ReverseInteger.reverse(-1) == -1);
        assert (ReverseInteger.reverse(120) == 21);
        assert (ReverseInteger.reverse(102) == 201);
    }

}
