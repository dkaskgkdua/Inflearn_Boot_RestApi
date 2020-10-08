package com.example.restfulwebservice.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
public class User {
    private Integer id;
    private String name;
    private Date joinDate;
}
