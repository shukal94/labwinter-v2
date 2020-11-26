package com.solvd.lab.v2.automation.sshukalovich.runner;


import com.solvd.lab.v2.automation.sshukalovich.domain.button.RegularButton;
import com.solvd.lab.v2.automation.sshukalovich.domain.coordinate.Point;
import com.solvd.lab.v2.automation.sshukalovich.domain.interfaces.Button;
import com.solvd.lab.v2.automation.sshukalovich.service.ButtonService;

public class Runner {

    public static void main(String[] args) {



        Button b = new RegularButton(1L, 1, new Point(3, 4), "hi", 3, 5);

       // Button c = ButtonService.create(new RegularButton(1, new Point(3, 4), "hi", 3, 5));

        ButtonService.create(b);
        Button d = ButtonService.getById(4L);
        System.out.println("");

    }
}
