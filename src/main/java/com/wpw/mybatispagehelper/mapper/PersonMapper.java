package com.wpw.mybatispagehelper.mapper;

import com.wpw.mybatispagehelper.entity.Person;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface PersonMapper {
    /**
     * 获取列表信息数据
     *
     * @param person 请求对象
     * @return 满足指定查询的列表信息
     */
    List<Person> listPerson(Person person);
}
