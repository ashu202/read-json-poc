package com.example.demo.pojo;

import java.util.List;

import lombok.Data;

@Data
public class MyPojo
{
    private Metadata metadata;

    private List <Datum> data;
}