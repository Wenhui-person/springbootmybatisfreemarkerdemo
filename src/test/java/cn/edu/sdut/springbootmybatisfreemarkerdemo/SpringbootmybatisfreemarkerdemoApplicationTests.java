package cn.edu.sdut.springbootmybatisfreemarkerdemo;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest(classes = SpringbootmybatisfreemarkerdemoApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class SpringbootmybatisfreemarkerdemoApplicationTests {
    public void print(int row){
        if(row>0){
            System.out.println("操作成功");
        }else{
            System.out.println("操作失败");
        }
    }

}
