package ru.project.congratSystem.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {


    private long id;
    private String name;
    private String surname;
    private String username;
    private double dateOfBirth;
    private String password;
    private Friend friend;

    public User(long id, String name, String surname, String username,
                double dateOfBirth, String password, Friend friend) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.username = username;
        this.dateOfBirth = dateOfBirth;
        this.password = password;
        this.friend = friend;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", username='" + username + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", password='" + password + '\'' +
                ", friend=" + friend +
                '}';
    }
}
