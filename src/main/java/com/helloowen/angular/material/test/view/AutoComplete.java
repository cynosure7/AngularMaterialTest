package com.helloowen.angular.material.test.view;

import com.helloowen.freshwater.Element;
import com.helloowen.freshwater.WebBinding;


@WebBinding(css = ".autocompletedemoBasicUsage")
public interface AutoComplete {

    @WebBinding(".ng-binding")
    String getHeadline();

    @WebBinding(".ng-valid.ng-valid-required.ng-dirty.ng-valid-parse p")
    String getDescription1();

    @WebBinding(".layout-row.md-whiteframe-z1")
    Element getInputField();

    @WebBinding(value = ".ng-valid.ng-valid-required.ng-dirty.ng-valid-parse p", index = 1)
    String getDescription2();

}
