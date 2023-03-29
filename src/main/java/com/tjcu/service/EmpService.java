package com.tjcu.service;

import com.tjcu.dao.EmpDao;
import com.tjcu.entity.Emp;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author 王恒杰
 * @date 2021/12/17 14:52
 * @Description:
 */

public interface EmpService {
    /**
     *  增
     * @param emp
     */
    public void insertEmp(Emp emp);

    /**
     * 删除
     *
     * @param id
     */
    public void deleteById(Integer id);

    /**
     * 查所有
     * @return
     */
    public List<Emp> showEmp();

    /**
     *更新
     * @param emp
     */
    public void updateEmp(Emp emp);
    /**
     * 数据回显
     * @param id
     * @return
     */
    public Emp selectEmpById(Integer id);
}
