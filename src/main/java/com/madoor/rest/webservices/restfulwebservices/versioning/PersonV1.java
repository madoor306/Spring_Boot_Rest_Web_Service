package com.madoor.rest.webservices.restfulwebservices.versioning;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonV1 {
    private String name;

    public PersonV1() {
    }

    public PersonV1(String name) {
        this.name = name;
    }
}
