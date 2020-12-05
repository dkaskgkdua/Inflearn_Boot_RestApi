package com.example.restfulwebservice.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Post {
    @Id
    @GeneratedValue
    private Integer id;

    private String description;

    // User : Post -> 1 : (0~N), Main : Sub -> Parent : Child
    // 지연 로딩 방식 : 사용자 Entity 조회 할 때 Post 엔티티가 로딩되는게 아니라 Post 데이터가 로딩되는 시점에 필요한 사용자 데이터를 가져오겠다는 뜻
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private User user;
}
