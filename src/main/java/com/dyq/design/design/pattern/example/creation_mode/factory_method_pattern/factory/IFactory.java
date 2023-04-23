package com.dyq.design.design.pattern.example.creation_mode.factory_method_pattern.factory;

import com.dyq.design.design.pattern.example.creation_mode.factory_method_pattern.operation.Operation;

public interface IFactory {

    /**
     * 创建运算方式
     * @return
     */
    public Operation createOperation();
}
