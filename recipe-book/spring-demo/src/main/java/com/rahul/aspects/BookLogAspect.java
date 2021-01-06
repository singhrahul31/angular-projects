package com.rahul.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class BookLogAspect {

    @Before("execution(void com.rahul.dao.BookDao.loadBooks())")
    public void logBooks() {
        System.out.println("book is getting logged");
    }
    
}
