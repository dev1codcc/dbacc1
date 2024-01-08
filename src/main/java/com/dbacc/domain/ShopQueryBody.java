package com.dbacc.domain;

import lombok.Data;

@Data
public class ShopQueryBody {
    String apiVersion;
    String appId;
    String enckey;
    String mobileNo;
    String provCity;
    String shopName;
}
