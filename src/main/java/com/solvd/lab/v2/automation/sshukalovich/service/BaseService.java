package com.solvd.lab.v2.automation.sshukalovich.service;


import com.solvd.lab.v2.automation.sshukalovich.dao.ButtonDAO;
import com.solvd.lab.v2.automation.sshukalovich.io.PropertyReader;

import java.util.Map;

public abstract class BaseService {
    protected static final PropertyReader PROPS = PropertyReader.getInstance();

    protected static final Map<String, ButtonDAO> BUTTON_DAOS = Map.of(
            "MOCK", new com.solvd.lab.v2.automation.sshukalovich.dao.impl.mock.ButtonDAOImpl(),
            "OBJ", new com.solvd.lab.v2.automation.sshukalovich.dao.impl.clasz.ButtonDAOImpl(),
            "SQL", new com.solvd.lab.v2.automation.sshukalovich.dao.impl.sql.ButtonDAOImplSQl()
    );
}
