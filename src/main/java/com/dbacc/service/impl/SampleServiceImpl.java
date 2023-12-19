package com.dbacc.service.impl;

import com.alibaba.fastjson2.JSON;
import com.dbacc.domain.SaData;
import com.dbacc.service.SampleService;
import org.apache.commons.io.FileUtils;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Services are the way to define the functions
 * test for runner
 */
public class SampleServiceImpl implements SampleService {

    @Override
    public List<SaData> getSaDataList() throws IOException {
        File file = ResourceUtils.getFile("classpath:sample.json");
        String json = FileUtils.readFileToString(file, "UTF-8");
        List<SaData> saDataList;
        saDataList = JSON.parseArray(json, SaData.class);
        return saDataList;
    }
}
