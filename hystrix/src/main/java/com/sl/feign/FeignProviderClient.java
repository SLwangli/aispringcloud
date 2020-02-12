package com.sl.feign;

import com.sl.entity.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

/**
 * @author WangLi
 * @version 1.0.0
 * @creaTtime 2020-02-11 10:36
 **/

@FeignClient(value = "provider")
public interface FeignProviderClient {
    @GetMapping("/student/findAll")
    public Collection<Student> findAll();
}
