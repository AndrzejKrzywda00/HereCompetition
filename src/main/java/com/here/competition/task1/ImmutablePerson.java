package com.here.competition.task1;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

@AllArgsConstructor
@Getter
public class ImmutablePerson {
    private String name;
    private Date birthday;
}
