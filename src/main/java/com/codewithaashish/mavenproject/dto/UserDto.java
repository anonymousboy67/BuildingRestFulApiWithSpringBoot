package com.codewithaashish.mavenproject.dto;

public class UserDto {
    private Long id;
    private String name;
    private String email;
    private int age;
    private String city;


    public UserDto() {}

    public UserDto(Long id, String name, String email, int age, String city) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.city = city;
    }

    //Getter and Setter
    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}
    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}
    public String getCity() {return city;}
    public void setCity(String city) {this.city = city;}
}
