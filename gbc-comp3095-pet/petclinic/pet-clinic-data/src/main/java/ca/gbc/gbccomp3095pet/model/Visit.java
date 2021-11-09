package ca.gbc.gbccomp3095pet.model;

import java.time.LocalDate;

public class Visit extends BaseEntity{

    private LocalDate date;
    private String description;
    private Pet pet;
}
