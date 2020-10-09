package com.example.restfulwebservice.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@JsonIgnoreProperties(value ={"password"})
public class User {
    private Integer id;
    @Size(min=2, message = "Name은 2글자 이상 입력해 주세요.")
    private String name;
    // 과거 데이터만 올 수가 있다(시간)
    @Past
    private Date joinDate;
    // response 응답 시 제외
//    @JsonIgnore
    private String password;
//    @JsonIgnore
    private String ssn;
}
