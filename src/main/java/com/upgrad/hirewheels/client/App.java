package com.upgrad.hirewheels.client;

import com.upgrad.hirewheels.daos.UserDAO;
import com.upgrad.hirewheels.practice.BalanceService;
import com.upgrad.hirewheels.practice.UserService;
import com.upgrad.hirewheels.practice.User;
import com.upgrad.hirewheels.models.Users;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {



        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        /*===================================================================================================================================*/

        System.out.println("-------------------------------------Checkpoint 1 Solution---------------------------------------");

        User user = (User) context.getBean("user1");
        System.out.println(user);

        BalanceService balanceService = (BalanceService) context.getBean("balanceService");
        System.out.println(balanceService.checkUserBalance());

        System.out.println("-------------------------------------Checkpoint 2 Solution---------------------------------------");

        UserService userService = (UserService) context.getBean("userService");
        System.out.println(userService);

        /*===================================================================================================================================*/
        System.out.println("-------------------------------------Checkpoint 3 Solution---------------------------------------");
        Users users = new Users("Ram", "Kumar", "password", "ramkumuar@4.com", "9795958876", 10000);

        UserDAO userDAO = (UserDAO) context.getBean("userDAO");

        System.out.println("-------------------------------------Inserted Users Details---------------------------------------");
        Users savedUser = userDAO.insertUsersDetails(users);

        /*System.out.println("-------------------------------------Fetch All User Details---------------------------------------");
        System.out.println(userDAO.fetchAllUsersDetails());

        *//*System.out.println("-------------------------------------Fetch User Details by Id---------------------------------------");
        System.out.println(userDAO.fetchUserDetails(2));

        *//*System.out.println("-------------------------------------Deleted User Detail by Id---------------------------------------");
        System.out.println(userDAO.deleteUser(2));*/

    }
}
