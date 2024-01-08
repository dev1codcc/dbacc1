package com.dbacc.domain;

import lombok.Data;

@Data
public class ShopRecordBody {
    String apiVersion;
    String appId;
    String enckey;
    String mobileNo;
    String provCity;
    String shopName;
}
