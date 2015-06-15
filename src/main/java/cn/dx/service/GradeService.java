package cn.dx.service;

import java.util.List;

import cn.dx.model.Grade;

public interface GradeService {
	List<Grade> getPageList();
	void add(Grade grade);
	void delete(Grade grade);
	void update(Grade grade);
	Grade getGrade(int id);
}
