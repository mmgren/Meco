package com.meco.springboot.service.impl;

import com.meco.springboot.dao.JobDao;
import com.meco.springboot.model.Job;
import com.meco.springboot.service.IJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "jobService")
public class JobServiceImpl implements IJobService {

    @Autowired
    private JobDao jobDao;

    @Override
    public List<Job> listJobs(String params, Integer pageSize) {
        return jobDao.listJobs(params, pageSize);
    }
}
