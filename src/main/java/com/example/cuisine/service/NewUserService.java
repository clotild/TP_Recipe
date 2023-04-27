package com.example.cuisine.service;

import com.example.cuisine.model.NewUser;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NewUserService {
    private static int idSequence = 0;
    private static List<NewUser> newusers = new ArrayList<>(Arrays.asList());
    public NewUser createNewUser (String name,String firstname, String email, String password, String urlphoto) {
        NewUser n = new NewUser(++idSequence, name, firstname, email, password, urlphoto + idSequence);
        newusers.add(n);
        return n;
    }
    public List<NewUser> fetchAllNewUsers(){

        return newusers;
    }
}
