package com.solvd.lab.v2.automation.sshukalovich.dao.impl.clasz;



import com.solvd.lab.v2.automation.sshukalovich.constant.IOConstant;
import com.solvd.lab.v2.automation.sshukalovich.dao.ButtonDAO;
import com.solvd.lab.v2.automation.sshukalovich.domain.interfaces.Button;
import com.solvd.lab.v2.automation.sshukalovich.io.ObjectIO;

import java.util.List;

public class ButtonDAOImpl implements ButtonDAO {
    @Override
    public Button create(Button o) {
        new ObjectIO<Button>().write(o, IOConstant.RQ_PATH);
        return o;
    }

    @Override
    public Button getById(Long id) {
        return new ObjectIO<Button>().read(IOConstant.RQ_PATH);
    }

    @Override
    public List<Button> get() {
        return null;
    }

    @Override
    public Button update(Button o) {
        return null;
    }

    @Override
    public Long deleteById(Long id) {
        return null;
    }
}
