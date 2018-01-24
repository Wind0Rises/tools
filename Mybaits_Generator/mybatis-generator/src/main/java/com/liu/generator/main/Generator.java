/**
 * 
 */
package com.liu.generator.main;

import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

/**
 * @author jerrywang
 * @time 下午10:07:08
 */
public class Generator {
	public static void main(String[] args) throws IOException, XMLParserException, 
			InvalidConfigurationException, SQLException, InterruptedException {
		
		//MBG执行过程种的警告信息
		List<String> warnings = new ArrayList<String>();
		ConfigurationParser cp = new ConfigurationParser(warnings);
		
		//读取mybatis-generator配置文件
		InputStream is = Generator.class.getResourceAsStream("/generator/generatorConfig.xml");
		if (is == null) {
			System.out.println("配置文件不存在！");
		}
		Configuration config = cp.parseConfiguration(is);
		is.close();
		
		boolean overwrite = true;
		DefaultShellCallback callback = new DefaultShellCallback(overwrite);
		
		//创建MyBatisGenerator
		MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
		
		//执行生成代码
		myBatisGenerator.generate(null);
		
		//输出警告信息
		for(String item : warnings){
			System.out.println(item);
		}
		System.out.println("*******************   执行结束    *******************");
	}
}
