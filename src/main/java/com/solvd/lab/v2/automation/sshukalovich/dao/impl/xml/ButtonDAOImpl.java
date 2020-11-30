package com.solvd.lab.v2.automation.sshukalovich.dao.impl.xml;

import com.solvd.lab.v2.automation.sshukalovich.constant.IOConstant;
import com.solvd.lab.v2.automation.sshukalovich.dao.ButtonDAO;
import com.solvd.lab.v2.automation.sshukalovich.domain.button.RegularButton;
import com.solvd.lab.v2.automation.sshukalovich.domain.interfaces.Button;
import com.solvd.lab.v2.automation.sshukalovich.io.XMLIO;

import javax.xml.bind.JAXBException;
import java.util.List;

public class ButtonDAOImpl implements ButtonDAO {
    @Override
    public Button create(Button o) {
        try {
            new XMLIO<>(Button.class).write(o, String.format(IOConstant.XML_OBJ_PATH, o.getClass().getCanonicalName()));
        } catch (JAXBException e) {
            e.printStackTrace();
            return null;
        }
        return o;
    }

    @Override
    public Button getById(Long id) {
        try {
            return new XMLIO<>(RegularButton.class).read(String.format(IOConstant.XML_OBJ_PATH, RegularButton.class.getCanonicalName()));
        } catch (JAXBException e) {
            e.printStackTrace();
            return null;
        }
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
