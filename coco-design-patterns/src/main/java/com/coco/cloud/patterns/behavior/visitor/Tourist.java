package com.coco.cloud.patterns.behavior.visitor;

/**
 * @author liuqiang@ourdocker.cn
 * @version 0.0.1
 * @date 2021/4/27 22:55
 */
public interface Tourist {

    void accept(Visitor visitor);

    void doAction();

}
