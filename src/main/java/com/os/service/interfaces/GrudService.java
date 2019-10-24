package com.os.service.interfaces;

import java.util.List;

public interface GrudService<T> {
    boolean create(T object);

    T getById(int id);

    List<T> getAll();

    boolean update(T object);


}
