package com.tckj.feign;

import com.tckj.entity.Student;
import com.tckj.feign.fallback.ProviderClientFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * @author WCH
 * @date 2019/12/18 11:03
 */
@FeignClient(value = "server-provider",fallback = ProviderClientFallback.class)
public interface ProviderClient {
    @GetMapping("/student/getPort")
     String getPort();

    @GetMapping("/student/findAll")
     Collection<Student> findAll();

}
