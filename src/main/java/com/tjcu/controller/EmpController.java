package com.tjcu.controller;

import com.tjcu.entity.Emp;
import com.tjcu.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author 王恒杰
 * @date 2021/12/17 15:52
 * @Description:
 */
@Controller
@CrossOrigin
@ResponseBody
public class EmpController {
    @Autowired
    private EmpService empService;

    @RequestMapping("/emp/queryAll")
    public  List<Emp> queryall(){
        List<Emp> emps = empService.showEmp();
        return emps;
    }

    /**
     * 删除
     * @param id
     */
    @RequestMapping("/emp/delete")
    public void delete(Integer id){
        empService.deleteById(id);
    }
    @RequestMapping("/emp/add")
    public void add(@RequestBody Emp emp){
        if(emp.getId()!=null){
            empService.updateEmp(emp);
        }else {
            emp.setId(null);
            empService.insertEmp(emp);
        }
    }

    @RequestMapping("/emp/queryOne")
    public Emp query(Integer id){
        Emp emp = empService.selectEmpById(id);
        return emp;
    }
}
