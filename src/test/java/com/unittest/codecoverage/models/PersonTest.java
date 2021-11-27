package com.unittest.codecoverage.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {
    @Test
    public void testSetterAndGetterName() {
        Person person = new Person();

        person.setName("Name1");
        assertEquals("Name1", person.getName());

        person.setName("Name2");
        assertEquals("Name2", person.getName());
    }

    @Test
    public void testSetterAndGetterAge() {
        Person person = new Person();

        person.setAge(10);
        assertEquals(10, person.getAge());

        person.setAge(20);
        assertEquals(20, person.getAge());
    }

    @Test
    public void testSetterAndGetterGender() {
        Person person = new Person();

        person.setGender(Gender.M);
        assertEquals(Gender.M, person.getGender());

        person.setGender(Gender.F);
        assertEquals(Gender.F, person.getGender());
    }
}
