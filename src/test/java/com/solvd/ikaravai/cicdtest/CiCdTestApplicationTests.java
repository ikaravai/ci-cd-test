package com.solvd.ikaravai.cicdtest;

import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class CiCdTestApplicationTests {

    public static Logger log = LoggerFactory.getLogger(CiCdTestApplicationTests.class);

    @Test
    void contextLoads() {
        log.info(() -> "--- Executing tests ---");
        assertEquals(2, 1 + 1);
    }

    @Test
    void megaTest() {
        log.info(() -> "--- Executing Mega TEST ---");
        assertEquals(10, 5 + 5);
    }

    @Test
    void dummyTest() {
        log.info(() -> "--- Executing Updated rigorous Dummy TEST ---");
        Random rand = new Random();
        var x = rand.nextInt(10);
        assertTrue(x <= 100);
    }

}
