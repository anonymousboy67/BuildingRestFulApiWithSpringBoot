package com.codewithaashish.mavenproject;

public class CreateUserRequest {
    private String name;
    private String email;
    private int age;
    private String city;

    public CreateUserRequest() {}

    //Getter and Setter
    public String getName(){ return name; }
    public  void setName(String name){ this.name = name; }
    public String getEmail(){ return email; }
    public  void setEmail(String email){ this.email = email; }
    public int getAge(){ return age; }
    public  void setAge(int age){ this.age = age; }
    public String getCity(){ return city; }
    public  void setCity(String city){ this.city = city; }
}
