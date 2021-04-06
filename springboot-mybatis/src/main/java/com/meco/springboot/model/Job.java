package com.meco.springboot.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class Job implements Serializable {
    private String category;
    private String zkdw;
    private String dwdm;
    private String zkzw;
    private String zwdm;

}
