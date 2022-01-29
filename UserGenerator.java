package com.example.RanderUserGenerator.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Random;

@RestController
public class UserGenerator {

    @RequestMapping("/")
    public String GetUser() {
        String output = "";
        Random rand = new Random();

        int userNameLength = rand.nextInt(8, 14);
        String usernameOutput = "";
        String userName = "";

        for(int i = 0; i<userNameLength; i++){
            char c = (char) (rand.nextInt(26) + 'a');
            userName = userName + c;
        }
        usernameOutput = ("Your new random username is: " + userName + "\n");


        int passwordLength = rand.nextInt(8, 14);
        String password = "";
        String passwordOutput = "";


        for(int i = 0; i<passwordLength; i++) {
            char c = (char) rand.nextInt(48,90);
            password = password + c;
        }
        passwordOutput = ("\n" + "Your new random password is: " + password);
        
        output = usernameOutput + passwordOutput;

        return output;
    }




}
