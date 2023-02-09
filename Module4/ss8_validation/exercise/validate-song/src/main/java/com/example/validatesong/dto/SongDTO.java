package com.example.validatesong.dto;


import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class SongDTO {
    @NotEmpty
    @Size(max = 800)
    @Pattern(regexp = "^[A-Za-z0-9\\s]+$",message = "wrong!")
    private String name;

    @NotEmpty
    @Size(max = 300)
    @Pattern(regexp = "^[A-Za-z0-9\\s]+$",message = "wrong!")
    private String musician;

    @NotEmpty
    @Size(max = 1000)
    @Pattern(regexp = "^[A-Za-z0-9,\\s]+$",message = "wrong!")
    private String type;

    public SongDTO() {
    }

    public SongDTO(String name, String musician, String type) {
        this.name = name;
        this.musician = musician;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMusician() {
        return musician;
    }

    public void setMusician(String musician) {
        this.musician = musician;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
