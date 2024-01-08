package com.dbacc.service.impl;

import com.dbacc.domain.Shop;
import com.dbacc.domain.ShopRecordBody;
import com.dbacc.service.RecordShopService;

public class RecordShopServiceImpl implements RecordShopService {
    @Override
    public Shop addAshop(ShopRecordBody shopRecordBody) {
        Shop shop = new Shop();
        shop.setProvince(shopRecordBody.getProvCity());

        return shop;
    }
}
