package com.vv.kafka.Kafkasample;

public class User {
    public User(String fName, String lName, String dept) {
        this.fName = fName;
        this.lName = lName;
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "User{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", dept='" + dept + '\'' +
                '}';
    }

    String fName;
    String lName;
    String dept;

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}
