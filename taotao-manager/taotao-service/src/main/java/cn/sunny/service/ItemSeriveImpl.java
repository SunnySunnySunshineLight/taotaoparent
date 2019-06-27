package cn.sunny.service;

import cn.sunny.mapper.TbItemMapper;
import cn.sunny.pojo.TbItem;
import cn.sunny.pojo.TbItemExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName
 * @Description TODO
 * @Author sunny
 * @Date 2019-6-18 17:47
 * @Version 1.0
 **/
@Service
public class ItemSeriveImpl implements ItemService {
    @Autowired
    private TbItemMapper tbItemMapper;
    @Override
    public TbItem getItemById(long id) {
        TbItemExample tbItemExample = new TbItemExample();
        TbItemExample.Criteria criteria = tbItemExample.createCriteria();
        criteria.andIdEqualTo(id);
        List<TbItem> tbItems = tbItemMapper.selectByExample(tbItemExample);
        if(tbItems.isEmpty()){
            return  null;
        }else {
            return tbItems.get(0);
        }
    }
}
