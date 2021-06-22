package com.inttom;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BlogApplicationTests {

    @Test
    void contextLoads() {

        System.out.println(ladder(11));

    }


    /**
     * 走台阶，一次可以走一个台阶，或者 走两个台阶：斐波那契数列
     */
    @Test
    int ladder(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else {
            return ladder(n - 1) + ladder(n - 2);
        }
    }

}
