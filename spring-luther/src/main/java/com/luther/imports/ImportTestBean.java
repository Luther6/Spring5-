package com.luther.imports;

import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author liujie
 * @datetime 2019/11/6 22:35
 */
public class ImportTestBean{
	public void show(){
		System.out.println("我就是我不一样的烟火");
	}


}
