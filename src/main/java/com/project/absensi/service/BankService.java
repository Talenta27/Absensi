package com.project.absensi.service;

import com.project.absensi.entity.Bank;
import com.project.absensi.dao.BaseDAO;
import com.project.absensi.dao.BankDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankService extends BaseService<Bank> {

    @Autowired
    private BankDAO dao;

    @Override
    protected BaseDAO<Bank> getDAO() {
        return dao;
    }

    public Bank findByName(Bank param) {
        return dao.findByName(param);
    }
}
