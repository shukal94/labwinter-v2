package com.solvd.lab.v2.automation.sshukalovich.dao;


import com.solvd.lab.v2.automation.sshukalovich.domain.interfaces.UIComponent;

import java.util.List;

public interface DAO<T extends UIComponent> {
    T create(T o);
    T getById(Long id);
    List<T> get();
    T update(T o);
    Long deleteById(Long id);

}
