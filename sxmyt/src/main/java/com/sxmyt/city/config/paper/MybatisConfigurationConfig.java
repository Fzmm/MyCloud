package com.sxmyt.city.config.paper;

import com.github.pagehelper.PageHelper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

/**
 * @author fzm
 * @title: MybatisConfigurationConfig
 * @projectName sxmyt
 * @description: TODO
 * @date 2019/5/7  23:48
 */
@Configuration
public class MybatisConfigurationConfig {

    @Bean
    public PageHelper  pageHelper(){
        PageHelper pageHelper=new PageHelper();
        Properties properties=new Properties();
        properties.setProperty("offsetPageNum","true");
        properties.setProperty("rowBoundsWithCount", "true");
        properties.setProperty("reasonable", "true");
        pageHelper.setProperties(properties);
        return pageHelper;
    }
}
