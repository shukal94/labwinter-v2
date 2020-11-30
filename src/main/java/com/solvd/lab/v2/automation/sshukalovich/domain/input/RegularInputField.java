package com.solvd.lab.v2.automation.sshukalovich.domain.input;


import com.solvd.lab.v2.automation.sshukalovich.domain.base.BaseUIComponent;
import com.solvd.lab.v2.automation.sshukalovich.domain.coordinate.Point;
import com.solvd.lab.v2.automation.sshukalovich.domain.interfaces.InputField;

import java.io.Serializable;

public final class RegularInputField extends BaseUIComponent implements InputField, Serializable {
    private int width;
    private int height;

    public RegularInputField(Long id, int color, Point coordinates, String text, int width, int height) {
        super(id, color, coordinates, text);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String clear() {
        return null;
    }

    public String clearAll() {
        return null;
    }

    @Override
    public void click() {

    }
}
