package com.luther.methodinject;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author liujie
 * @datetime 2019/11/2 23:55
 */
@Component("prototypeBean")
@Scope("prototype")
public class PrototypeBean {
}
