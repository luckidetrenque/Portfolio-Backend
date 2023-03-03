package com.portfolio.LucianoRodriguez.dto;

import java.time.Year;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class ProjectDto {
    @NotBlank
    @Size(min = 5, max = 20, message = "El nombre debe tener entre 5 y 20 caracteres")
    private String name;
    @NotBlank
    private Year year;
    @NotBlank
    @Size(min = 20, max = 100, message = "La descripción debe tener entre 20 y 100 caracteres")
    private String description;
    @NotBlank
    private String link;
    @NotBlank
    private String image;
}
