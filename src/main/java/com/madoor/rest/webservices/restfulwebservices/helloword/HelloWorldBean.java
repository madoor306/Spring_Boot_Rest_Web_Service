package com.madoor.rest.webservices.restfulwebservices.helloword;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HelloWorldBean {

    private String message;

    public HelloWorldBean(String msg) {
        this.message = msg;
    }

    @Override
    public String toString() {
        return "HelloWorldBean{" +
                "message='" + message + '\'' +
                '}';
    }
}
