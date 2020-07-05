package cn.edu.sdut.springbootmybatisfreemarkerdemo.mapper;

import cn.edu.sdut.springbootmybatisfreemarkerdemo.entity.Grade;

import java.util.List;

public interface GradeMapper {
    List<Grade> queryGrades();
    Grade queryGradeById(int gradeid);
    int addGrade(Grade grade);
    int updateGrade(Grade grade);
    //删除暂缓
    int deleteGrade(int gradeid);
}
