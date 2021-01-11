package edu.pasudo123.study.demo.index.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class IndexController {

    @Value("${my.number}") private int myNumber;
    @Value("${my.number.less.then.ten}") private int myNumberLessThenTen;
    @Value("${my.number.in.range}") private int myNumberInRange;
    @Value("${my.uuid}") private String myUuid;

    @GetMapping("/my-random")
    Map<String, Object> index() {
        return new HashMap<>(){{
            put("my.number", myNumber);
            put("my.number.less.then.ten", myNumberLessThenTen);
            put("my.number.in.range", myNumberInRange);
            put("my.uuid", myUuid);
        }};
    }
}
