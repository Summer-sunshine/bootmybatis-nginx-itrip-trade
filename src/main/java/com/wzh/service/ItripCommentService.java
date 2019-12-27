package com.wzh.service;

import com.wzh.util.ItripListCommentVO;
import com.wzh.util.ItripScoreCommentVO;
import com.wzh.util.Page;


import java.util.Map;

public interface ItripCommentService {
    //根据酒店id查询酒店评分
    public ItripScoreCommentVO getCommentAvgScore(Long id) throws Exception;
    //根据酒店id查询各种评论数量
    public Integer getItripCommentCountByMap(Map<String,Object> param)throws Exception;
    //根据酒店id查询各种评论
    public Page<ItripListCommentVO> getItripCommentListByMap(Map<String,Object> param,Integer pageNo,Integer pageSize)throws Exception;
}
