package com.upgrad.hirewheels.practice;

public class BalanceService {

    private UserBalanceInterface userBalanceInterface;

    public void setUserBalanceInterface(UserBalanceInterface userBalanceInterface) {
        this.userBalanceInterface = userBalanceInterface;
    }

    public double checkUserBalance() {
        UserBalanceImpl userBalanceImpl = new UserBalanceImpl();
        return userBalanceImpl.getBalance();

    }


}
