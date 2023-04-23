package com.dyq.design.design.pattern.example.creation_mode.abstract_factory_pattern;

import com.dyq.design.design.pattern.example.creation_mode.abstract_factory_pattern.add.IAdd;
import com.dyq.design.design.pattern.example.creation_mode.abstract_factory_pattern.div.IDiv;
import com.dyq.design.design.pattern.example.creation_mode.abstract_factory_pattern.factory.IFactory;

import java.io.FileInputStream;
import java.util.Properties;
public class ReflectFactory {

    static Object factory;

    static {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("D:\\WorkSpace\\java\\github\\design-pattern-example\\src\\main\\java\\com\\dyq\\design\\design\\pattern\\example\\creation_mode\\abstract_factory_pattern\\config.properties"));
            String factoryName = properties.getProperty("factoryName");
            factory = Class.forName(factoryName).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static IAdd createAdd() {
        return factory == null ? null : ((IFactory) factory).createAdd();
    }

    public static IDiv createDiv() {
        return factory == null ? null : ((IFactory) factory).createDiv();
    }
    
}
