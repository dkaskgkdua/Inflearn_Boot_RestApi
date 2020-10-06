package com.example.restfulwebservice;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor  // 기본생성자
public class HelloWorldBean {
    private String message;
}
