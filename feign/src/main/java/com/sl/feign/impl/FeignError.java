package com.sl.feign.impl;

import com.sl.entity.Student;
import com.sl.feign.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * @author WangLi
 * @version 1.0.0
 * @creaTtime 2020-02-11 11:20
 **/
@Component
public class FeignError implements FeignProviderClient {

    @Override
    public Collection<Student> findAll() {
        return null;
    }


}
