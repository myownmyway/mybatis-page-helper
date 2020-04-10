package com.wpw.mybatispagehelper.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wpw.mybatispagehelper.service.PersonService;
import com.wpw.mybatispagehelper.entity.Person;
import com.wpw.mybatispagehelper.mapper.PersonMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wpw
 */
@Service
public class PersonServiceImpl implements PersonService {
    private PersonMapper personMapper;

    public PersonServiceImpl(PersonMapper personMapper) {
        this.personMapper = personMapper;
    }

    @Override
    public PageInfo<Person> listPerson(Person person) {
        PageHelper.startPage(person.getPageNumber(), person.getPageSize());
        List<Person> personList = personMapper.listPerson(person);
        return PageInfo.of(personList);
    }
}
