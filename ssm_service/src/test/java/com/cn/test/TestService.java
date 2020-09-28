package com.cn.test;

import com.cn.pojo.Items;
import com.cn.service.ItemsService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @Author: huangganda
 * @Data: 2020-09-28 10:59
 */
public class TestService {
    @Test
    public void findAll(){
        //加载配置文件
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("classpath:spring-service.xml");
        //反射创建对象
        ItemsService itemsService = app.getBean(ItemsService.class);

        List<Items> all = itemsService.findAll();

        for (Items items : all) {
            System.out.println(items);
        }

    }
}
