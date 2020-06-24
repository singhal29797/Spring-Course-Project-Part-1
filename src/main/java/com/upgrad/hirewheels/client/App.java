package com.upgrad.hirewheels.client;

import com.upgrad.hirewheels.practice.BalanceService;
import com.upgrad.hirewheels.practice.UserBalanceImpl;
import com.upgrad.hirewheels.practice.Users;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Users users = (Users) context.getBean("user1");
        System.out.println(users);

        BalanceService balanceService = (BalanceService) context.getBean("balanceService");
        System.out.println(balanceService.checkUserBalance());


    }
}
