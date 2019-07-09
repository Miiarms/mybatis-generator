/*
 * 文件名：CustomJavaMapperMethodGenerator.java
 */

package cn.cai;

import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.Interface;
import org.mybatis.generator.api.dom.java.JavaVisibility;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.java.Parameter;
import org.mybatis.generator.codegen.mybatis3.javamapper.elements.AbstractJavaMapperMethodGenerator;

public class CustomJavaMapperMethodGenerator extends AbstractJavaMapperMethodGenerator {

	@Override
	public void addInterfaceElements(Interface interfaze) {
		
		interfaze.addAnnotation("@Repository");
		FullyQualifiedJavaType importtype = new FullyQualifiedJavaType("org.springframework.stereotype.Repository");
		interfaze.addImportedType(importtype);
		
        // 创建方法对象
        Method method = new Method();
        // 设置该方法为public
        method.setVisibility(JavaVisibility.PUBLIC);
        // 设置返回类型
        FullyQualifiedJavaType returnType = new FullyQualifiedJavaType(introspectedTable.getBaseRecordType());
        // 方法对象设置返回类型对象
        method.setReturnType(returnType);
        // 设置方法名称
        method.setName("selectByExampleOne");

        // 设置参数类型是example
        FullyQualifiedJavaType parameterType = new FullyQualifiedJavaType(introspectedTable.getExampleType());
        // 为方法添加参数，变量名称example
        method.addParameter(new Parameter(parameterType, "example"));
        
        interfaze.addMethod(method);
	}

}
