package com.rahul;

import com.rahul.config.SpringDemoConfig;
import com.rahul.dao.BookDao;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringDemoConfig.class);

        BookDao dao = context.getBean("bookDao", BookDao.class);
        dao.loadBooks();
        context.close();
    }
}
