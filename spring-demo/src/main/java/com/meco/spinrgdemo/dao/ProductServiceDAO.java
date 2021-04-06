package com.meco.spinrgdemo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Map;

// @Repository注释用于为Spring Boot应用程序创建数据库存储库
@Repository
public class ProductServiceDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    private Collection<Map<String, Object>> rows; //jdbc.queryForList("SELECT QUERY");


}
