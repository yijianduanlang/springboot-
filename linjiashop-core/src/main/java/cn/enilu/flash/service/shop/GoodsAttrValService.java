package cn.enilu.flash.service.shop;


import cn.enilu.flash.bean.entity.shop.GoodsAttrVal;
import cn.enilu.flash.dao.shop.GoodsAttrValRepository;

import cn.enilu.flash.service.BaseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodsAttrValService extends BaseService<GoodsAttrVal,Long,GoodsAttrValRepository>  {
    private Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    private GoodsAttrValRepository goodsAttrValRepository;

}
