package com.upgrad.hirewheels.practice;

public class BalanceService {

    private UserBalanceInterface userBalanceInterface;

    public void setUserBalanceInterface(UserBalanceInterface userBalanceInterface) {
        this.userBalanceInterface = userBalanceInterface;
    }

    public double checkUserBalance() {
        UserBalanceInterface userBalanceInterface = new UserBalanceImpl();
        userBalanceInterface.getBalance();

        return 1000.00;

    }


}
