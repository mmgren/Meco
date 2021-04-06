package com.meco.spinrgdemo;

import com.meco.spinrgdemo.mapper.JobMapper;
import com.meco.spinrgdemo.pojo.Job;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class MybatisPlusTestApplicationTests {

    @Autowired
    private JobMapper jobMapper;

    @Test
    public void findAll(){
        List<Job> jobList = jobMapper.selectAll();
        System.out.println(jobList);
    }
}
