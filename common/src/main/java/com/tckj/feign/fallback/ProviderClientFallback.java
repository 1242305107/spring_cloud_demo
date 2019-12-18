package com.tckj.feign.fallback;

import com.tckj.entity.Student;
import com.tckj.feign.ProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * @author WCH
 * @date 2019/12/18 11:28
 */
@Component
public class ProviderClientFallback implements ProviderClient {
    @Override
    public String getPort() {
        return "你的网络不稳定，请稍后再试";
    }

    @Override
    public Collection<Student> findAll() {
        return null;
    }
}
