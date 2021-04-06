package com.meco.spinrgdemo.mapper;

import com.meco.spinrgdemo.pojo.Job;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.BaseMapper;

@Repository
public interface JobMapper extends BaseMapper<Job> {

}
