/*
 * 文件名：CustomXmlElementGenerator.java
 */

package cn.cai;

import org.mybatis.generator.api.dom.xml.Attribute;
import org.mybatis.generator.api.dom.xml.Element;
import org.mybatis.generator.api.dom.xml.TextElement;
import org.mybatis.generator.api.dom.xml.XmlElement;
import org.mybatis.generator.codegen.mybatis3.xmlmapper.elements.AbstractXmlElementGenerator;

/**
 * 自定义拓展方法
 * @author legend
 * @version 2019年6月27日
 */
public class CustomXmlElementGenerator extends AbstractXmlElementGenerator{

	@Override
	public void addElements(XmlElement parentElement) {
		
		XmlElement selectColumn = new XmlElement("include"); 
		selectColumn.addAttribute(new Attribute("refid", "Base_Column_List"));		
		
		XmlElement where = new XmlElement("include");
		where.addAttribute(new Attribute("refid", "Example_Where_Clause"));
		
		 // 增加 selectByExampleOne
        XmlElement selectByExampleOne = new XmlElement("select");
        selectByExampleOne.addAttribute(new Attribute("id", "selectByExampleOne"));
        selectByExampleOne.addAttribute(new Attribute("resultMap", "BaseResultMap"));
        selectByExampleOne.addAttribute(new Attribute("parameterType", introspectedTable.getExampleType()));
        
        selectByExampleOne.addElement(new TextElement("select "));
        selectByExampleOne.addElement(selectColumn);
        selectByExampleOne.addElement(new TextElement("from  " + introspectedTable.getFullyQualifiedTableNameAtRuntime()));
        selectByExampleOne.addElement(where);
        parentElement.addElement(selectByExampleOne);
		
	}

}
