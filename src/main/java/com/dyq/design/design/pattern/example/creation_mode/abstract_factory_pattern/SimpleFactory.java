package com.dyq.design.design.pattern.example.creation_mode.abstract_factory_pattern;

import com.dyq.design.design.pattern.example.creation_mode.abstract_factory_pattern.add.DoubleAdd;
import com.dyq.design.design.pattern.example.creation_mode.abstract_factory_pattern.add.FloatAdd;
import com.dyq.design.design.pattern.example.creation_mode.abstract_factory_pattern.add.IAdd;
import com.dyq.design.design.pattern.example.creation_mode.abstract_factory_pattern.add.IntAdd;
import com.dyq.design.design.pattern.example.creation_mode.abstract_factory_pattern.div.DoubleDiv;
import com.dyq.design.design.pattern.example.creation_mode.abstract_factory_pattern.div.FloatDiv;
import com.dyq.design.design.pattern.example.creation_mode.abstract_factory_pattern.div.IDiv;
import com.dyq.design.design.pattern.example.creation_mode.abstract_factory_pattern.div.IntDiv;

public class SimpleFactory {

    /**
     * 根据需要，可以把工厂换成其他不同工厂
     */
    private static final String factory = "FloatFactory";

    public static IAdd createAdd() {
        IAdd add = null;
        switch (factory) {
        case "IntFactory":
            add = new IntAdd();
            break;
        case "FloatFactory":
            add = new FloatAdd();
            break;
        case "DoubleFactory":
            add = new DoubleAdd();
            break;
        default:
            break;
        }
        return add;
    }

    public static IDiv createDiv() {
        IDiv div = null;
        switch (factory) {
        case "IntFactory":
            div = new IntDiv();
            break;
        case "FloatFactory":
            div = new FloatDiv();
            break;
        case "DoubleFactory":
            div = new DoubleDiv();
            break;
        default:
            break;
        }
        return div;
    }
    
}
