package com.portfolio.LucianoRodriguez.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class ExperienceDto {
    @NotBlank
    @Size(min = 20, max = 40, message = "El puesto debe tener entre 20 y 40 caracteres")
    private String position;
    @NotBlank
    private String period;
    @NotBlank
    private String logo;
    @NotBlank
    @Size(min = 20, max = 100, message = "La descripción debe tener entre 20 y 100 caracteres")
    private String description;

    public ExperienceDto() {
    }

    public ExperienceDto(String position, String period, String logo, String description) {
        this.position = position;
        this.period = period;
        this.logo = logo;
        this.description = description;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}
