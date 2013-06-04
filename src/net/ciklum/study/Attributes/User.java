package net.ciklum.study.Attributes;


import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class User {

    @Property(value = "name")
    public String username;

    public String firstname;

    @Property(value = "lname")
    public String lastname;

    public String birthday;
    @Property(value = "userAge")
    public String age;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lasttname) {
        this.lastname = lasttname;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
