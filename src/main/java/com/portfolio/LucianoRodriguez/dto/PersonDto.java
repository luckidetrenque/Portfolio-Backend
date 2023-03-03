package com.portfolio.LucianoRodriguez.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class PersonDto {
    @NotBlank
    @Size(min = 5, max = 20, message = "El nombre debe tener entre 5 y 20 caracteres")
    private String name;
    @NotBlank
    @Size(min = 5, max = 20, message = "El apellido debe tener entre 5 y 20 caracteres")
    private String surname;
    @NotBlank
    @Size(min = 20, max = 40, message = "El título obtenido debe tener entre 20 y 40 caracteres")
    private String degree;
    @NotBlank
    @Size(min = 20, max = 100, message = "La info debe tener entre 20 y 100 caracteres")
    private String info;
    @NotBlank
    private String photo;

    public PersonDto() {
    }

    public PersonDto(String name, String surname, String degree, String info, String photo) {
        this.name = name;
        this.surname = surname;
        this.degree = degree;
        this.info = info;
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
    
}
