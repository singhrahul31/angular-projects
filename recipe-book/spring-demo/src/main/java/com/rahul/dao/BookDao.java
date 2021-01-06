package com.rahul.dao;

import org.springframework.stereotype.Component;

@Component
public class BookDao {

    public void loadBooks() {
        System.out.println("books loaded");
    }
    
}
