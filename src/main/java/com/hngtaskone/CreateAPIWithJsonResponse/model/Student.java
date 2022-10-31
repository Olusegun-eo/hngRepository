package com.hngtaskone.CreateAPIWithJsonResponse.model;



public class Student {

    private String slackUserName;
    private boolean isBacked;
    private int age;
    private String bio;

    public Student(String slackUserName, boolean isBacked, int age, String bio) {
        this.slackUserName = slackUserName;
        this.isBacked = isBacked;
        this.age = age;
        this.bio = bio;
    }

    public String getSlackUserName() {
        return slackUserName;
    }

    public void setSlackUserName(String slackUserName) {
        this.slackUserName = slackUserName;
    }

    public boolean isBacked() {
        return isBacked;
    }

    public void setBacked(boolean backed) {
        isBacked = backed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }


}