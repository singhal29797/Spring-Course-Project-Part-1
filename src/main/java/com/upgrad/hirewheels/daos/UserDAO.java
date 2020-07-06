package com.upgrad.hirewheels.daos;

import com.upgrad.hirewheels.models.Users;

import java.util.List;

public interface UserDAO {

    public Users insertUsersDetails(Users users);
    public Users updatePassword(int id);
    public Users fetchUserDetails(int user_id);
    public List<Users> fetchAllUsersDetails();
    public boolean deleteUser(int user_id);

}


