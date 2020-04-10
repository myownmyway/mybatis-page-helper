package com.wpw.mybatispagehelper.controller;

import com.github.pagehelper.PageInfo;
import com.wpw.mybatispagehelper.entity.Person;
import com.wpw.mybatispagehelper.service.PersonService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wpw
 */
@RestController
public class PersonController {
    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }


    @PostMapping(value = "/list-pagination")
    public PageInfo<Person> listPerson(@RequestBody Person person) {
        PageInfo<Person> pageInfo = personService.listPerson(person);
        return pageInfo;
    }
}
