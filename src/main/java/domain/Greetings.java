package com.redi.demo.controller;

import com.redi.demo.controller.GreetingController;
import com.redi.demo.domain.Greetings;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class Greetings {
    private AtomicLong counter = new AtomicLong();
    @GetMapping("greetings")
    public GreetingController greetings(@RequestParam(value = "name", defaultValue = "world")String name) {
        //save statiscis for the name increment counter
        return new Greetings (counter.incrementAndGet(),1L,"hello, " + name + "!");
    }
    @GetMapping("statistics")
    public List<GreetingStatistic> statistics() {
        //return statistics
        return new ArrayList<>();
    }
    // add another method for statistics method
}
