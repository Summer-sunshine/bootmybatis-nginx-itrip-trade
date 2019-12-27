package com.wzh.service;

import com.wzh.util.StoreVO;
import java.util.List;
import java.util.Map;

public interface ItripHotelTempStoreService {
    public List<StoreVO> queryRoomStore(Map<String,Object> param)throws Exception;

    public Integer queryRoomStoreById(Map<String, Object> param)throws Exception;

    public boolean vailDateRoomStote(Map<String,Object> param)throws Exception;

    public Integer updateRoomStore(Map<String, Object> param)throws Exception;
}
