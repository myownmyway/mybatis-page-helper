package com.wpw.mybatispagehelper.service;

import com.github.pagehelper.PageInfo;
import com.wpw.mybatispagehelper.entity.Person;

/**
 * @author wpw
 */
public interface PersonService {
    /**
     * @param  person 请求对象
     * @return 分页后的数据信息
     */
    PageInfo<Person> listPerson( Person  person);

}
