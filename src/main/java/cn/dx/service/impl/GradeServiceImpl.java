package cn.dx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import cn.dx.dao.GradeDao;
import cn.dx.model.Grade;
import cn.dx.service.GradeService;

@Service("GradeService")
public class GradeServiceImpl implements GradeService {

    @Autowired
    @Qualifier("GradeDao")
    private GradeDao gradeDao;

    @Override
    public List<Grade> getPageList() {
        return this.gradeDao.getList();
    }

    @Override
    public void add(Grade grade) {
        this.gradeDao.insert(grade);
    }

    @Override
    public void delete(Grade grade) {
        this.gradeDao.deleteByPrimaryKey(grade.getId());
    }

    @Override
    public void update(Grade grade) {
        this.gradeDao.updateByPrimaryKeySelective(grade);
    }

    @Override
    public Grade getGrade(int id) {
        return this.gradeDao.selectByPrimaryKey(id);
    }

}
