package com.meco.springboot.controller;

import com.meco.springboot.model.Job;
import com.meco.springboot.service.IJobService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value="/api/job")
public class JobController {
    @Resource(name = "jobService")
    private IJobService jobService;

    @GetMapping("/listJobs")
    public List<Job> listJobs(){
        String param = "乡镇";
        Integer pageSize = 10;
        return jobService.listJobs(param, pageSize);
    }

}
