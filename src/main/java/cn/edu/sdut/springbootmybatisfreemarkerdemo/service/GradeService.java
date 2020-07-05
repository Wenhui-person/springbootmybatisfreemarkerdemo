package cn.edu.sdut.springbootmybatisfreemarkerdemo.service;

import cn.edu.sdut.springbootmybatisfreemarkerdemo.entity.Grade;
import org.springframework.stereotype.Service;

import java.util.List;


public interface GradeService {

    List<Grade> queryGrades();
    Grade queryGradeById(int gradeid);
    int addGrade(Grade grade);
    int updateGrade(Grade grade);
    //删除暂缓
    int deleteGrade(int gradeid);
}
