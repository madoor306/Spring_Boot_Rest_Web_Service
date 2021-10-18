package com.madoor.rest.webservices.restfulwebservices.versioning;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonV2 {
    private Name name;

    public PersonV2() {
    }

    public PersonV2(Name name) {
        this.name = name;
    }
}
