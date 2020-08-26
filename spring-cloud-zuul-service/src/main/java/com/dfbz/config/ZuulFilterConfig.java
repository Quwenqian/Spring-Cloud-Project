package com.dfbz.config;

import com.dfbz.filter.TokenFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class ZuulFilterConfig {

    @Bean
    public TokenFilter tokenFilter(){
        return new TokenFilter();
    }

}
