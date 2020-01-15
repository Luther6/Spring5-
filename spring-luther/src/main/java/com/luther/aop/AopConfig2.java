package com.luther.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 多个相同的扫描会报错？
 *
 *
 * @author liujie
 * @date 2019/12/15 23:32
 */
@Configuration
@ComponentScan("com.luther.aop")
public class AopConfig2 {
}
