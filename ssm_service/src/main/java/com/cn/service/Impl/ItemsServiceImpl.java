package com.cn.service.Impl;

import com.cn.dao.ItemsDao;
import com.cn.pojo.Items;
import com.cn.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: huangganda
 * @Data: 2020-09-28 10:57
 */
@Service
public class ItemsServiceImpl implements ItemsService {
    @Autowired
    private ItemsDao itemsDao;
    @Override
    public List<Items> findAll() {
        return itemsDao.findAll();
    }
}
