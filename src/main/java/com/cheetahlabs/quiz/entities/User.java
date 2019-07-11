package com.cheetahlabs.quiz.entities;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class User {
    private int id;
    private String name;
}
