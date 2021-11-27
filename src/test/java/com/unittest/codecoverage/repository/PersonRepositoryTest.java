package com.unittest.codecoverage.repository;

import com.unittest.codecoverage.models.Gender;
import com.unittest.codecoverage.models.Person;
import com.unittest.codecoverage.repositories.PersonRepository;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class PersonRepositoryTest {

    @Test
    public void testInsert_shouldInsertPersonWithSuccessWhenAllPersonsInfoIsFilled() {
        Person person = new Person();
        person.setName("Name");
        person.setAge(21);
        person.setGender(Gender.M);

        PersonRepository personRepository = new PersonRepository();

        personRepository.insert(person);
    }

    @Test
    public void testInsert_shouldThrowPersonExceptionWhenPersonIsNull() {

        List<String> expectedErrors = Lists.newArrayList("person can't be null");
        String expectedMessage = String.join(";", expectedErrors);
        Person person = null;

        PersonRepository personRepository = new PersonRepository();

        assertThatThrownBy(() -> personRepository.insert(person))
                .isInstanceOf(NullPointerException.class)
                .hasMessage(expectedMessage);
    }

    @Test
    public void testUpdate_shouldUpdatePersonWithSuccessWhenAllPersonsInfoIsFilled() {
        Person person = new Person();
        person.setName("Name");
        person.setAge(21);
        person.setGender(Gender.M);

        PersonRepository personRepository = new PersonRepository();

        personRepository.update(person);
    }

    @Test
    public void testUpdate_shouldThrowPersonExceptionWhenPersonIsNull() {

        List<String> expectedErrors = Lists.newArrayList("person can't be null");
        String expectedMessage = String.join(";", expectedErrors);
        Person person = null;

        PersonRepository personRepository = new PersonRepository();

        assertThatThrownBy(() -> personRepository.update(person))
                .isInstanceOf(NullPointerException.class)
                .hasMessage(expectedMessage);
    }

    @Test
    public void testGet_shouldGetPersonWithSuccessWhenNameIsFilled() {
        String name = "Name";
        PersonRepository personRepository = new PersonRepository();
        personRepository.get(name);
    }

    @Test
    public void testGet_shouldThrowPersonExceptionWhenNameIsNull() {

        List<String> expectedErrors = Lists.newArrayList("name can't be null");
        String expectedMessage = String.join(";", expectedErrors);
        String name = null;

        PersonRepository personRepository = new PersonRepository();

        assertThatThrownBy(() -> personRepository.get(name))
                .isInstanceOf(NullPointerException.class)
                .hasMessage(expectedMessage);
    }

    @Test
    public void testDelete_shouldDeletePersonWithSuccessWhenNameIsFilled() {
        String name = "Name";
        PersonRepository personRepository = new PersonRepository();
        personRepository.delete(name);
    }

    @Test
    public void testDelete_shouldThrowPersonExceptionWhenNameIsNull() {

        List<String> expectedErrors = Lists.newArrayList("name can't be null");
        String expectedMessage = String.join(";", expectedErrors);
        String name = null;

        PersonRepository personRepository = new PersonRepository();

        assertThatThrownBy(() -> personRepository.delete(name))
                .isInstanceOf(NullPointerException.class)
                .hasMessage(expectedMessage);
    }
}
