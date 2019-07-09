package cn.cai;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.Interface;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.java.TopLevelClass;

/*
 * 文件名：LombokPlugin.java
 */
/**
 * 
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 * @author legend
 * @version 2019年6月18日
 * 版权：Copyright(C), 2017-2018 by guangzhou tydic
 * 修改历史记录：
 * 1. 修改时间：
 *    修改人：
 *    修改内容描述：
 * 2. ....
 *
 */
public class LombokPlugin extends PluginAdapter {

	@Override
	public boolean validate(List<String> arg0) {
		// TODO Auto-generated method stub
		return true;
	}
	
	@Override
    public boolean modelBaseRecordClassGenerated(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
		List<IntrospectedColumn> primaryKeyColumns = introspectedTable.getPrimaryKeyColumns();
        //添加domain的import
        topLevelClass.addImportedType("lombok.Data");
        topLevelClass.addImportedType("lombok.EqualsAndHashCode");
        
        //添加domain的注解
        topLevelClass.addAnnotation("@Data");
        if(primaryKeyColumns.size()>1) {
        	topLevelClass.addAnnotation("@EqualsAndHashCode(callSuper=true)");
        }else {
        	topLevelClass.addAnnotation("@EqualsAndHashCode");
        }
        //添加domain的注释
        topLevelClass.addJavaDocLine("/**");
        topLevelClass.addJavaDocLine("* Created by Mybatis Generator " );
        topLevelClass.addJavaDocLine("* @author legend " );
        topLevelClass.addJavaDocLine("* @date " +date2Str(new Date()));
        topLevelClass.addJavaDocLine("*/");

        
        return true;
    }

	
    @Override
	public boolean modelPrimaryKeyClassGenerated(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
    	
    	 //添加domain的import
        topLevelClass.addImportedType("lombok.Data");
        
        //添加domain的注解
        topLevelClass.addAnnotation("@Data");
        
        return true;
	}

	@Override
    public boolean clientGenerated(Interface interfaze, TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        //Mapper文件的注释
        interfaze.addJavaDocLine("/**");
        interfaze.addJavaDocLine("* Created by Mybatis Generator " );
        interfaze.addJavaDocLine("* @author legend " );
        interfaze.addJavaDocLine("* @date " +date2Str(new Date()));
        interfaze.addJavaDocLine("*/");
        return true;
    }

    @Override
    public boolean modelSetterMethodGenerated(Method method, TopLevelClass topLevelClass, IntrospectedColumn introspectedColumn, IntrospectedTable introspectedTable, ModelClassType modelClassType) {
        //不生成getter
        return false;
    }

    @Override
    public boolean modelGetterMethodGenerated(Method method, TopLevelClass topLevelClass, IntrospectedColumn introspectedColumn, IntrospectedTable introspectedTable, ModelClassType modelClassType) {
        //不生成setter
        return false;
    }
    
    
    
    
    

    private String date2Str(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(date);
    }

}
