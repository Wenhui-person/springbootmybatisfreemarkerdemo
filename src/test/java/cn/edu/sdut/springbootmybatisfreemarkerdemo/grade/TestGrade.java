package cn.edu.sdut.springbootmybatisfreemarkerdemo.grade;

import cn.edu.sdut.springbootmybatisfreemarkerdemo.SpringbootmybatisfreemarkerdemoApplicationTests;
import cn.edu.sdut.springbootmybatisfreemarkerdemo.entity.Grade;
import cn.edu.sdut.springbootmybatisfreemarkerdemo.service.GradeService;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

public class TestGrade extends SpringbootmybatisfreemarkerdemoApplicationTests {
    @Resource
    private GradeService gradeService;
    
    @Test
    public void testQueryGrades(){
        List<Grade> grades=this.gradeService.queryGrades();
        grades.forEach(g-> System.out.println("g = " + g));
    }
    @Test
    public void testQueryGradeById(){
        int gradeid=3;
        System.out.println(this.gradeService.queryGradeById(gradeid));
    }
    @Test
    public void testAddGrade(){
        Grade grade=new Grade(0,"计科1904");
        this.print(this.gradeService.addGrade(grade));
    }
    @Test
    public void testUpdateGrade(){
        Grade grade=new Grade(12,"数媒1904");
        this.print(this.gradeService.updateGrade(grade));
    }

}
