package com.wzh.service;

import com.wzh.po.ItripHotelOrder;
import com.wzh.po.ItripUserLinkUser;
import com.wzh.util.ItripPersonalOrderRoomVO;
import com.wzh.util.Page;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public interface ItripHotelOrderService {
    /*总金额*/
    public BigDecimal getItripHotelOrderPayAmount(int count,Long roomId)throws Exception;
    /*添加订单*/
    public Map<String,String> insertItripHotelOrder(ItripHotelOrder itripHotelOrder, List<ItripUserLinkUser> itripUserLinkUserList)throws Exception;
    /*通过用户数据查询订单该用户所有数据*/
    public Page getOrderListByMap(Map<String,Object> param,Integer pageNo,Integer pageSize)throws Exception;
    /*根据订单id查找个人订单信息*/
    public ItripHotelOrder getItripHotelOrderById(Long id)throws Exception;
    /*根据订单id查找房型信息*/
    public ItripPersonalOrderRoomVO getItripHotelOrderRoomInfoById(Long id)throws Exception;
    /*通过订单编号获取订单信息*/
    public  ItripHotelOrder getItripHotelOrderByorderNo(String orderNo)throws Exception;
    /*根据订单编号修改订单支付状态（成功）*/
    public Integer updateHotelOrderStatusByorderNo(Map<String,Object> param)throws Exception;
    /*根据订单编号修改订单支付状态（入住）*/
    public Integer updateHotelOrderStatusByorderNoss(Map<String,Object> param)throws Exception;
}
