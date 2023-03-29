package com.tjcu.dao;

import com.tjcu.entity.Emp;

import java.util.List;

/**
 * @author 王恒杰
 * @date 2021/12/17 14:43
 * @Description:
 */
public interface EmpDao {
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
