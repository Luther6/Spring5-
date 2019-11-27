package com.luther.config;

import com.luther.bean.MethodBean;
import com.luther.bean.MethodBean1;
import com.luther.dao.UserDao;
import com.luther.imports.ImportBDRegistryBean;
import com.luther.imports.ImportSelectorBean;
import com.luther.reimport.ImportBean;
import com.luther.reimport.ReImportConifg;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.*;
import org.springframework.core.PriorityOrdered;
import org.springframework.stereotype.Component;

/**
 *
 *
 * @author liujie
 * @datetime 2019/10/14 16:37
 */
@Configuration
@ComponentScan(basePackages = {"com.luther"})
@Import({ImportSelectorBean.class,ImportBDRegistryBean.class})
@EnableAspectJAutoProxy
public class AppConfig{
}
