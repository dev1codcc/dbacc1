package com.dbacc.service;

import com.dbacc.domain.SaData;

import java.io.IOException;
import java.util.List;
public interface SampleService {
    List<SaData> getSaDataList() throws IOException;
}
