package com.example.garbageCollection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class staticTest3 {
    @GetMapping("/hello3")
    public static void main(String[] args){
        Stack stack = new Stack();

        for(int i =1;i<10000000;i++){
            stack.push(i);
        }

        for(int i=1;i<10000000;i++){
            stack.popWell();
        }
        System.out.println("hello");
    }
}
