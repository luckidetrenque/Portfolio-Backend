package com.portfolio.LucianoRodriguez.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class SkillDto {
    @NotBlank
    @Size(min = 5, max = 20, message = "El nombre debe tener entre 5 y 20 caracteres")
    private String name;
    @NotBlank
    private Integer level;

    public SkillDto() {
    }

    public SkillDto(String name, Integer level) {
        this.name = name;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }
}
