package com.sipios.keiko.controller.dto;

import lombok.Data;

import java.time.LocalDate;
import java.util.UUID;

@Data
public class User {

    private UUID id;
    private Civility civility;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private boolean isMajor;
    private Integer children;
    private boolean isFamilleNombreuse;
}
