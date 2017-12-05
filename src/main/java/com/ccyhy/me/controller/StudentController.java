package com.ccyhy.me.controller;

import com.ccyhy.me.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * @author zqh
 * @date 2017年12月5日11:47:02
 */
@Controller
@RequestMapping("student")
public class StudentController {
    @Resource(name = "studentService")
    private StudentService studentService;
    @RequestMapping(value = "/getAllStudent",method = RequestMethod.GET)
    public ModelAndView getAllStudent()
    {
        ModelAndView mav=new ModelAndView();
        mav.setViewName("studentDisplay");
        mav.addObject("students",studentService.getAllStudent());
        return mav;
    }
}
