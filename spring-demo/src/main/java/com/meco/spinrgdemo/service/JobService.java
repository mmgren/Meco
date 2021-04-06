package com.meco.spinrgdemo.service;

import com.meco.spinrgdemo.pojo.Job;
import org.springframework.stereotype.Service;

import java.util.List;

public interface JobService {

    /**
     * 获取职位信息
     * @param pageCount
     * @return
     */
    List<Job> getJobs(Integer pageCount);
}
