package com.rentaroom.rentaroom.login;

public interface SecurityService {
    String findLoggedInUsername();

    void autologin(String username, String password);
}