package com.example.demo.registration;

import org.springframework.stereotype.Service;

import java.util.function.Predicate;

@Service
public class EmailValid implements Predicate<String> {
    @Override
    public boolean test(String s) {
        //TODO: Regex
        return true;
    }
}
