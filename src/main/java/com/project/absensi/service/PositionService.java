package com.project.absensi.service;

import com.project.absensi.entity.Position;
import com.project.absensi.dao.BaseDAO;
import com.project.absensi.dao.PositionDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PositionService extends BaseService<Position>{

    @Autowired
    private PositionDAO dao;

    @Override
    protected BaseDAO<Position> getDAO() {
        return dao;
    }

    public Position findByName(Position param) {
        return dao.findByName(param);
    }
}
