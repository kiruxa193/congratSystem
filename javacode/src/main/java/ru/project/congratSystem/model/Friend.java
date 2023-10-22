package ru.project.congratSystem.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Friend {

    private long id;
    private String friendName;
    private String friendSurname;
    private double friendDateOfBirth;

    public Friend(long id, String friendName, String friendSurname, double friendDateOfBirth) {
        this.id = id;
        this.friendName = friendName;
        this.friendSurname = friendSurname;
        this.friendDateOfBirth = friendDateOfBirth;
    }


    @Override
    public String toString() {
        return "Friend{" +
                "id=" + id +
                ", friendName='" + friendName + '\'' +
                ", friendSurname='" + friendSurname + '\'' +
                ", friendDateOfBirth=" + friendDateOfBirth +
                '}';
    }
}
