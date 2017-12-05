package com.ccyhy.me.service;

import com.ccyhy.me.dao.StudentDao;
import com.ccyhy.me.model.Student;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zqh
 */
@Service("studentService")
public class StudentService {
    @Resource(name = "studentDao")
    private StudentDao studentDao;
    public List<Student> getAllStudent()
    {
        return studentDao.findAll();
    }
}
