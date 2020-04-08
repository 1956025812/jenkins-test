package com.coco.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
    }


    Map<String, String> map = new HashMap<String, String>() {
        private static final long serialVersionUID = 1L;
        {
            put("1", "method1");
            put("2", "method2");
            put("3", "method3");
            put("4", "method4");
            put("5", "method5");
            put("6", "method6");
            put("7", "method7");
            put("8", "method8");
            put("9", "method9");
            put("10", "method10");
        }
    };


    public void doBusiness(String type) {
        this.callRemoteProduce(map.get(type));
    }

    private void callRemoteProduce(String method) {
    }


}
