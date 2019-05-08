package com.salon.service.serviceInterface;

public interface ServiceInterface<TYPE, ID> {
    TYPE create(TYPE type);
    TYPE update(TYPE type);
    void delete(ID id);
    TYPE read(ID id);
}