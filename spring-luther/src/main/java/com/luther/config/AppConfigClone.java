package com.luther.config;


import com.luther.bean.MethodBean;
import com.luther.imports.ImportSelectorBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

/**
 * 这里并没有添加@Configuration注解但是你如何利用它来完成
 * Spring的上下文的初始化与刷新,好像没有任何差异。
 *
 *
 *
 * @author liujie
 * @datetime 2019/11/6 16:06
 */
@Component
@ComponentScan("com.luther")
@Import(ImportSelectorBean.class)
public class AppConfigClone {


}
