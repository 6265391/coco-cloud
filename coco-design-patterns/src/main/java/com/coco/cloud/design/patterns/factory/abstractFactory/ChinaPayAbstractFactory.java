package com.coco.cloud.design.patterns.factory.abstractFactory;

/**
 * @author liuqiang@ourdocker.cn
 * @version 0.0.1
 * @date 2020/2/24 18:34
 */
public class ChinaPayAbstractFactory implements PayAbstractFactory {

    @Override
    public Pay create(Pay pay) {
        return pay;
    }

}