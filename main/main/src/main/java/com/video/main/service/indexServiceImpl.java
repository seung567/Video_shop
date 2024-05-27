package com.video.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.video.main.repository.indexDAO;

@Service
public class indexServiceImpl implements indexService{

    @Autowired
    indexDAO indexDao;

    @Override
    public String indexGetName() {
        return indexDao.indexGetName();
    }
}
