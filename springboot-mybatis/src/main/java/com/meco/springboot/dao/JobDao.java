package com.meco.springboot.dao;

import com.meco.springboot.model.Job;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface JobDao {

    List<Job> listJobs(@Param("zkzw") String params, @Param("pageSize") Integer pageSize);
}
