package comment;

import static org.mybatis.generator.internal.util.StringUtility.isTrue;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.mybatis.generator.api.CommentGenerator;
import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.CompilationUnit;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.InnerClass;
import org.mybatis.generator.api.dom.java.InnerEnum;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.java.TopLevelClass;
import org.mybatis.generator.api.dom.xml.XmlElement;
import org.mybatis.generator.config.PropertyRegistry;

/**
 * 
 * <p>
 * mybatis注释生成器
 * <p>
 * 
 * @author wangjiawen
 * @version 1.0.0
 * @since 1.0.0
 * @createTime 下午4:27:41
 *
 */
public class MyCommentGenerator implements CommentGenerator {

	/**
	 * 注释——作者
	 */
	private static final String AUTHOR="wangjiawen";
	/**
	 * 注释——版本
	 */
	private static final String VERSION="1.0.0";
	
	
	private Properties properties;
	// 是否抑制所有注解的生成
	private boolean suppressAllComments;
	// 是否抑制注解中的时间戳生成
	private boolean suppressDate;

	public MyCommentGenerator() {
		super();
		this.properties = new Properties();
		this.suppressAllComments = false;
		this.suppressDate = false;
	}

	/**
	 * 从配置中获取抑制注释或抑制注释中的时间戳的值
	 */
	public void addConfigurationProperties(Properties properties) {
		this.properties.putAll(properties);
		suppressAllComments = 
				isTrue(properties.getProperty(PropertyRegistry.COMMENT_GENERATOR_SUPPRESS_ALL_COMMENTS));
		suppressDate = 
				isTrue(properties.getProperty(PropertyRegistry.COMMENT_GENERATOR_SUPPRESS_DATE));
	}
	
	/**
	 * 给javaModel属性添加注释
	 */
	public void addFieldComment(Field field, IntrospectedTable introspectedTable,
			IntrospectedColumn introspectedColumn) {
		if(suppressAllComments) {
			return;
		}
		
		StringBuilder sb=new StringBuilder();
		sb.append("/** ").append(introspectedColumn.getRemarks()).append(" */");
		field.addJavaDocLine(sb.toString());
	}

	/**
	 * TODO 为什么会有两个同样名字的方法，他们都是在什么时候被调用？
	 */
	public void addFieldComment(Field field, IntrospectedTable introspectedTable) {
	}
	public void addClassComment(InnerClass innerClass, IntrospectedTable introspectedTable) {
	}
	public void addClassComment(InnerClass innerClass, IntrospectedTable introspectedTable, boolean markAsDoNotDelete) {
	}
	public void addEnumComment(InnerEnum innerEnum, IntrospectedTable introspectedTable) {
	}
	/**
	 * 给getter方法添加注释
	 */
	public void addGetterComment(Method method, IntrospectedTable introspectedTable,
			IntrospectedColumn introspectedColumn) {
	}
	/**
	 * 给setter方法添加注释
	 */
	public void addSetterComment(Method method, IntrospectedTable introspectedTable,
			IntrospectedColumn introspectedColumn) {
	}
	/**
	 * 给mapper接口中生成的方法添加注释
	 */
	public void addGeneralMethodComment(Method method, IntrospectedTable introspectedTable) {
	}
	public void addJavaFileComment(CompilationUnit compilationUnit) {
	}
	/**
	 * 在注释中添加信息，告诉用户，这个元素是mybatis自动生成的
	 */
	public void addComment(XmlElement xmlElement) {
	}
	public void addRootComment(XmlElement rootElement) {
	}

	/**
	 * 给类上添加注释
	 */
	public void addModelClassComment(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
		if(suppressAllComments) {
			return;
		}
		
		topLevelClass.addJavaDocLine("/**");
		topLevelClass.addJavaDocLine("* <p>");
		topLevelClass.addJavaDocLine("*");
		topLevelClass.addJavaDocLine("* <p>");
		topLevelClass.addJavaDocLine("*");
		topLevelClass.addJavaDocLine("* @author "+AUTHOR);
		topLevelClass.addJavaDocLine("* @version "+VERSION);
		topLevelClass.addJavaDocLine("* @createTime "+formatDateToString(new Date()));
		topLevelClass.addJavaDocLine("*");
		topLevelClass.addJavaDocLine("*/");
	}
	
	private String formatDateToString(Date date){
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String stringDate = format.format(date);
		return stringDate;
	}
}
