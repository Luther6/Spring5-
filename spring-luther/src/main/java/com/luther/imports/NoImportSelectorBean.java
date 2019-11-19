package com.luther.imports;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.stereotype.Component;

/**
 * @author liujie
 * @datetime 2019/11/13 16:25
 */
@Component
public class NoImportSelectorBean implements ImportSelector {
	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		System.out.println("????????????????????????");
		return new String[0];
	}
}
