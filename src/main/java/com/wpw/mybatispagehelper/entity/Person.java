package com.wpw.mybatispagehelper.entity;

import com.wpw.mybatispagehelper.vo.RequestVo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author wpw
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain = true)
public class Person extends RequestVo implements Serializable {
    private Integer id;
    private String name;
    private String sex;
    private Integer age;
}
