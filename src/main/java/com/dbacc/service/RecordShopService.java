package com.dbacc.service;

import com.dbacc.domain.Shop;
import com.dbacc.domain.ShopRecordBody;

public interface RecordShopService {
    Shop addAshop(ShopRecordBody shopRecordBody);
}
