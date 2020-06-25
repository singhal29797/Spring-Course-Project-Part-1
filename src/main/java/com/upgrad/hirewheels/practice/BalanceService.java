package com.upgrad.hirewheels.practice;

//import org.springframework.beans.factory.annotation.Autowired;

public class BalanceService {

    private UserBalanceInterface userBalanceInterface;

    public void setUserBalanceInterface(UserBalanceInterface userBalanceInterface) {
        this.userBalanceInterface = userBalanceInterface;
    }
    public double checkUserBalance() {
        UserBalanceInterface userBalanceImpl = new UserBalanceImpl();
        return userBalanceImpl.getBalance();

    }

    @Override
    public String toString() {
        return "BalanceService{" +
                "checkUserBalance=" + checkUserBalance() +
                '}';
    }
}
