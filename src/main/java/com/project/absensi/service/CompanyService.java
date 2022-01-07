package com.project.absensi.service;

import com.project.absensi.dao.BaseDAO;
import com.project.absensi.dao.CompanyDAO;
import com.project.absensi.entity.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyService extends BaseService<Company> {
    @Autowired
    private CompanyDAO dao;

    @Override
    protected BaseDAO<Company> getDAO() {
        return dao;
    }

    public Company findByName(Company param) {
        return dao.findByName(param);
    }
}
