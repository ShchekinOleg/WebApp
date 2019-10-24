package com.os.service.impl;

import com.os.entity.Order;
import com.os.persistance.interfaces.Dao;
import com.os.service.interfaces.GrudService;

import java.util.List;

public abstract class GrudServiceImpl<T> implements GrudService<T> {

    public abstract Dao<T> getCorrespondingDao();

    @Override
    public boolean create(T object) {
        return getCorrespondingDao().create(object);
    }

    @Override
    public T getById(int id) {
        return getCorrespondingDao().getById(id);
    }

    @Override
    public boolean update(T object) {
        return getCorrespondingDao().update(object);
    }

    @Override
    public List<T> getAll() { return getCorrespondingDao().getAll();
    }


    public abstract void deleteOrder(Order order);
}
