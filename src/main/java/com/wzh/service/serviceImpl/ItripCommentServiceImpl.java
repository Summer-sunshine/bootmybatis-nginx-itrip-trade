package com.wzh.service.serviceImpl;

import com.wzh.mapper.ItripCommentMapper;
import com.wzh.service.ItripCommentService;
import com.wzh.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ItripCommentServiceImpl implements ItripCommentService {
    @Autowired
    private ItripCommentMapper itripCommentMapper;

    public ItripCommentMapper getItripCommentMapper() {
        return itripCommentMapper;
    }

    public void setItripCommentMapper(ItripCommentMapper itripCommentMapper) {
        this.itripCommentMapper = itripCommentMapper;
    }

    @Override
    public ItripScoreCommentVO getCommentAvgScore(Long id) throws Exception {
        return itripCommentMapper.getCommentAvgScore(id);
    }

    @Override
    public Integer getItripCommentCountByMap(Map<String, Object> param) throws Exception {
        return itripCommentMapper.getItripCommentCountByMap(param);
    }

    @Override
    public Page<ItripListCommentVO> getItripCommentListByMap(Map<String, Object> param, Integer pageNo, Integer pageSize) throws Exception {
        Integer totel=itripCommentMapper.getItripCommentCountByMap(param);
        pageNo= EmptyUtils.isEmpty(pageNo)? Constants.DEFAULT_PAGE_NO:pageNo;
        pageSize=EmptyUtils.isEmpty(pageSize)?Constants.DEFAULT_PAGE_SIZE:pageSize;
        Page page=new Page(pageNo,pageSize,totel);
        param.put("beginPos",page.getBeginPos());
        param.put("pageSize",page.getPageSize());
        List<ItripListCommentVO> itripListCommentVOS=itripCommentMapper.getItripCommentListByMap(param);
        page.setRows(itripListCommentVOS);
        return page;
    }
}
