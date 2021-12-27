package com.example.dagger2.Model;

import javax.inject.Inject;

public class SignupModel {

    private String edittextName;
    private String edittextSurname;

    @Inject
    public SignupModel(){}

    public String getEdittextName() {
        return edittextName;
    }

    public void setEdittextName(String edittextName) {
        this.edittextName = edittextName;
    }

    public String getEdittextSurname() {
        return edittextSurname;
    }

    public void setEdittextSurname(String edittextSurname) {
        this.edittextSurname = edittextSurname;
    }
}
