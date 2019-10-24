package com.os.persistance.interfaces;

import java.util.List;

public interface Dao<T> extends AutoCloseable {

    boolean create(T object);

    T getById(int id);

    List<T> getAll();

    boolean update(T object);

    void delete(T object);

    void close();
}
