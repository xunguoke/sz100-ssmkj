package com.cn.service;

import com.cn.pojo.Items;

import java.util.List;

/**
 * @Author: huangganda
 * @Data: 2020-09-28 10:56
 */
public interface ItemsService {
    /**
     * 查询所有
     * @return
     */
    List<Items> findAll();
}
