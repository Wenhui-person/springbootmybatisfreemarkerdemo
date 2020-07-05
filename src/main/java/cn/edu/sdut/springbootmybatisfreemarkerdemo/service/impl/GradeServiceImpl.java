package cn.edu.sdut.springbootmybatisfreemarkerdemo.service.impl;

import cn.edu.sdut.springbootmybatisfreemarkerdemo.entity.Grade;
import cn.edu.sdut.springbootmybatisfreemarkerdemo.mapper.GradeMapper;
import cn.edu.sdut.springbootmybatisfreemarkerdemo.service.GradeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GradeServiceImpl implements GradeService {
    @Resource
    private GradeMapper gradeMapper;

    @Override
    public List<Grade> queryGrades() {
        return this.gradeMapper.queryGrades();
    }

    @Override
    public Grade queryGradeById(int gradeid) {
        return this.gradeMapper.queryGradeById(gradeid);
    }

    @Override
    public int addGrade(Grade grade) {
        return this.gradeMapper.addGrade(grade);
    }

    @Override
    public int updateGrade(Grade grade) {
        return this.gradeMapper.updateGrade(grade);
    }

    @Override
    public int deleteGrade(int gradeid) {
        return this.gradeMapper.deleteGrade(gradeid);
    }
}
