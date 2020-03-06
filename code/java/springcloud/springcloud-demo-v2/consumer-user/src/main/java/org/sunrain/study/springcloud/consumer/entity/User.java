package org.sunrain.study.springcloud.consumer.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    public User(String name, String address) {
        this.name = name;
        this.address = address;
    }

    private Long id;

    private String name;

    private String address;
}
