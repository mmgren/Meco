package com.meco.spinrgdemo.service.impl;

import com.meco.spinrgdemo.dao.JobDao;
import com.meco.spinrgdemo.pojo.Job;
import com.meco.spinrgdemo.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobServiceImpl implements JobService {

    @Autowired
    private JobDao jobDao;

    @Override
    public List<Job> getJobs(Integer pageCount) {
        return jobDao.getJobs(pageCount);
    }
}
