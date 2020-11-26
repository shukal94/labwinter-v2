package com.solvd.lab.v2.automation.sshukalovich.domain.button;



import com.solvd.lab.v2.automation.sshukalovich.domain.base.BaseUIComponent;
import com.solvd.lab.v2.automation.sshukalovich.domain.coordinate.Point;

import java.io.Serializable;

public final class RadioButtonCls extends BaseUIComponent implements com.solvd.lab.v2.automation.sshukalovich.domain.interfaces.RadioButton, Serializable {
    private int radius;

    public RadioButtonCls(Long id, int color, Point coordinates, String text, int radius) {
        super(id, color, coordinates, text);
        this.radius = radius;
    }

    @Override
    public int getRadius() {
        return radius;
    }

    @Override
    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void click() {

    }
}
