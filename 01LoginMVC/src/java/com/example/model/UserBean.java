/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.model;

/**
 *
 * @author USER
 */
public class UserBean {
    private String username = "kentoy";
    private String password = "kentoy";
    public boolean isUserValid(String username, String password){
        return (username.equals(this.username)&&password.equals(this.password))?true:false;
    }
}
