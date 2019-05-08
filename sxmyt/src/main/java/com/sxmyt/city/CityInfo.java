package com.sxmyt.city;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @author fzm
 * @title: CityInfo
 * @projectName sxmyt
 * @description: TODO
 * @date 2019/5/8  23:35
 */
public class CityInfo extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(CityApplication.class);
    }


}
