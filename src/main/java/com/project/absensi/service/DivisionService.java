package com.project.absensi.service;

import com.project.absensi.dao.BaseDAO;
import com.project.absensi.dao.DivisionDAO;
import com.project.absensi.entity.Division;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DivisionService extends BaseService<Division> {
    @Autowired
    private DivisionDAO dao;

    @Override
    protected BaseDAO<Division> getDAO() {
        return dao;
    }

    public Division findByName(Division param) {
        return dao.findByName(param);
    }
}
