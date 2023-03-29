package com.tjcu.service.impl;

import com.tjcu.dao.EmpDao;
import com.tjcu.entity.Emp;
import com.tjcu.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author 王恒杰
 * @date 2021/12/17 14:53
 * @Description:
 */
@SuppressWarnings("all")
@Service
@Transactional(propagation = Propagation.REQUIRED)
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpDao empDao;

    @Override
    public void insertEmp(Emp emp) {
        empDao.insertEmp(emp);
    }

    @Override
    public void deleteById(Integer id) {
        empDao.deleteById(id);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<Emp> showEmp() {
        return empDao.showEmp();
    }

    @Override
    public void updateEmp(Emp emp) {
        empDao.updateEmp(emp);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Emp selectEmpById(Integer id) {
        return empDao.selectEmpById(id);
    }
}
