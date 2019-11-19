package com.luther.imports;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.context.annotation.ScannedGenericBeanDefinition;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.StandardAnnotationMetadata;
import org.springframework.core.type.classreading.AnnotationMetadataReadingVisitor;
import org.springframework.stereotype.Component;

/**
 *		这个类你也可以添加@Component等标签,但是建议你不要这么做,因为这将在我们的Spring插入无用类
 *		实现这个接口被只有被@Import接口导入才会起作用,作用就是它会对selectImport()方法返回的类的binaryName所对应的类
 *		转换为bd存储到类中,且BanName默认为类的binaryName,所以你要是获取它的话，就必须要使用BinaryName来获取
 *		传入的参数为导入此类的注解类的元数据在这里是	{@link com.luther.config.AppConfigClone}
 *
 *	那么为什么需要直接导入一个类呢?我们直接加上@Compoent不就好了吗?
 *	我们应该在Spring中看到很多@EnableXXX的类比如:@EnableLoadTimeWeaving
 *	这些类就是使用这个技术来达到一种功能:开关闭某种功能。在SpringBoot中你应该大量使用到@EnbaleXXX标签,
 *	但是不一定全部基于我们的这个类,也可能是实现了ImportBeanDefinitionRegistrar 这个接口。之后看
 *
 *
 *
 * @author liujie
 * @datetime 2019/11/6 22:35
 */
//@Component
public class ImportSelectorBean implements ImportSelector {
	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		return new String[]{ImportTestBean.class.getName()};
	}
}
