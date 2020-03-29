package com.jestly.application.db.dao;

public interface DAO<T>
{
    void save(T request) throws Exception;

    void update(T request) throws Exception;

    void delete(T request) throws Exception;
}
