package com.dbacc.domain;

import lombok.Data;

import java.util.Date;

@Data
public class Shop {
    public long id;
    public String name;
    public String logo;
    public String brand;
    public String type;
    public String province;
    public String city;
    public String dyurl;
    byte status; //0-in process, 1-ok, 2-NG
    Date record_date;
    String recorde_id;
    Date update_date;
}
