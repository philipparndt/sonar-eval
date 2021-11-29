package de.rnd7.sonareval;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

import java.util.List;

class MainTest {

    @Test
    void test_without_assert() {
        Main.main(new String[]{});
    }

    @Test
    void test_another_without_assert() {
        System.out.println("hi");
    }

}
