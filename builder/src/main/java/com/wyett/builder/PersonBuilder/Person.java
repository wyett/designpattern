package com.wyett.builder.PersonBuilder;

import lombok.NonNull;
import lombok.ToString;

/**
 * @author : wyettLei
 * @date : Created in 2019/9/25 11:17
 * @description: TODO
 * @modified By:
 * @version: $
 */

@ToString(doNotUseGetters = true)
public class Person {
    private final String name;
    private final String gender;
    private int age;
    private int hight;
    private int weight;
    private String address;
    private String code;

    public Person(@NonNull Builder builder) {
        this.name = builder.name;
        this.gender = builder.gender;
        this.age = builder.age;
        this.hight = builder.hight;
        this.weight = builder.weight;
        this.address = builder.address;
        this.code = builder.code;
    }

    public static class Builder {
        private final String name;
        private final String gender;
        private int age;
        private int hight;
        private int weight;
        private String address;
        private String code;

        Builder(String name, String gender) {
            this.name = name;
            this.gender = gender;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setHeight(int hight) {
            this.hight = hight;
            return this;
        }

        public Builder setWeight(int weight) {
            this.weight = weight;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setCode(String code) {
            this.code = code;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }


}
