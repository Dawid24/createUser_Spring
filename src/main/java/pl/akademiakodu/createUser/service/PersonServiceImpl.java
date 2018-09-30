package pl.akademiakodu.createUser.service;

import org.springframework.stereotype.Service;
import pl.akademiakodu.createUser.model.Person;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {
    @Override
    public Person createPerson(Person person) {
        return null;
    }

    @Override
    public void deletePerson(Long id) {

    }

    @Override
    public List<Person> getAllPersons() {
        return null;
    }
}
