package com.meco.spinrgdemo.dao;

import com.meco.spinrgdemo.pojo.Job;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobDao {
    List<Job> getJobs(@Param("pageCount") Integer pageCount);
}
