package com.example.twitxclone;

public class User {
    static final String N_key = "EMAILV";
    static  final String DOB_KEY = "DOBV";
    String email;
    String dob;

    public User(String email, String dob) {
        this.email = email;
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }


}
