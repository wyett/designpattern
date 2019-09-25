package com.wyett.builder.PersonBuilder;

import org.junit.Test;

/**
 * @author : wyettLei
 * @date : Created in 2019/9/25 11:33
 * @description: TODO
 */

public class PersonTest {
    @Test
    public void test() {
        Person person = new Person.Builder("Jack Ma", "male")
                .setAge(50)
                .setHeight(160)
                .setWeight(60)
                .setCode("xxxxxxxxxxxxxx")
                .setAddress("Hang Zhou")
                .build();
        System.out.println(person);
    }
}
