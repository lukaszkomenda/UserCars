package com.sda.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;

import java.time.LocalDate;
import java.util.List;

@Builder
@Getter
@AllArgsConstructor

public class User {

    @NonNull
    private String name;

    @NonNull
    private String surname;

    @NonNull
    private String adress;

    @NonNull
    private LocalDate dayOfBirth;

    private List<Cars> usersCars;
}
