package com.portfolio.LucianoRodriguez.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class EducationDto {
    @NotBlank
    @Size(min = 20, max = 80, message = "La institución debe tener entre 20 y 80 caracteres")
    private String institution;
    private String logo;
    @NotBlank
    @Size(min = 20, max = 40, message = "El título obtenido debe tener entre 20 y 40 caracteres")
    private String degree;
    @NotBlank
    private String period;

    public EducationDto() {
    }

    public EducationDto(String institution, String logo, String degree, String period) {
        this.institution = institution;
        this.logo = logo;
        this.degree = degree;
        this.period = period;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }
}
