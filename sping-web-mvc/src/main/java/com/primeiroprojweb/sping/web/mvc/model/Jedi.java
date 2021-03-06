package com.primeiroprojweb.sping.web.mvc.model;


import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

public class Jedi {
    @Valid
    @NotBlank
    private String name;
    @Valid
    @NotBlank
    private String lastName;

    public Jedi(final String name, final String lastname) {
        this.name = name;
        this.lastName = lastname;
    }

    public Jedi() {
     }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
