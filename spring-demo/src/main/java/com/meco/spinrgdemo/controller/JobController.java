package com.meco.spinrgdemo.controller;

import com.meco.spinrgdemo.pojo.Job;
import com.meco.spinrgdemo.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JobController {

    @Autowired
    private JobService jobService;

    public List<Job> getJobs(@RequestParam("pageCount") String pageCount){
        return jobService.getJobs(Integer.parseInt(pageCount));
    }

}
