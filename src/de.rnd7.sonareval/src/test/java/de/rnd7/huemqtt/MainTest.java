package de.rnd7.huemqtt;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

import java.util.List;

class MainTest {

    @Test
    void test_without_assert() {
        Main.main(new String[]{});
    }

}
