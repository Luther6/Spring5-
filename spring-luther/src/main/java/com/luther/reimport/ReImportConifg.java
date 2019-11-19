package com.luther.reimport;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

/**
 * 什么是重复Import情况呢?
 * 比如这里的{@link com.luther.reimport.ImportBean}
 * 我在当前的类中import一次,然后在别的被Spring 容器管理的类再import一次,这就是重复import
 *	当然你这个类必须要会被放到Spring容器中
 *
 *
 * @author liujie
 * @datetime 2019/11/6 19:06
 */
//@Component
@Import(ImportBean.class)
public class ReImportConifg {
}
