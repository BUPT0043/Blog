package cn.dx.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import cn.core.common.FilterModel;
import cn.dx.model.Grade;

@Component("GradeDao")
public interface GradeDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Grade record);

    int insertSelective(Grade record);

    Grade selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Grade record);

    int updateByPrimaryKeyWithBLOBs(Grade record);

    int updateByPrimaryKey(Grade record);
    
    List<Grade> getList();
}