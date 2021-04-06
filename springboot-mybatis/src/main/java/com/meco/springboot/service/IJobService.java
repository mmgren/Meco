package com.meco.springboot.service;

import com.meco.springboot.model.Job;

import java.util.List;

public interface IJobService {
    List<Job> listJobs(String params, Integer pageSize);
}
