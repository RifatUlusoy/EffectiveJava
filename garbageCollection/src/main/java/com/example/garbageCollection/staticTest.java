package com.example.garbageCollection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Random;

@RestController
public class staticTest {
    private static Random random = new Random();
    public static final ArrayList<Double> list = new ArrayList<Double>(1000000);

    @GetMapping("/hello1")
    public static void main(String[] args) throws InterruptedException{
        for(int i =0 ; i<1000000 ; i++){
            list.add(random.nextDouble());
        }
    }
}
