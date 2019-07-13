package tk.mybatis.mapper;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

import tk.mybatis.mapper.generator.Generator;
/**
 * 配置好src/test/resources/generator/generatorConfig.xml文件后，
 * 执行main方法即可生成你想要的PO类、Mapper接口、Mapper接口对应的配置文件
 * 
 * Copyright © 2017 
 * 
 * @ClassName: GMapper 
 * @Package tk.mybatis.mapper
 * @version V1.0.0
 */
public class GMapper {
	public static void main(String[] args) throws Exception, XMLParserException {
		List<String> warnings = new ArrayList<String>();
		boolean overwrite = true;
		ConfigurationParser cp = new ConfigurationParser(warnings);
		Configuration config = cp.parseConfiguration(
		        Generator.class.getResourceAsStream("/generator/generatorConfig.xml"));
		DefaultShellCallback callback = new DefaultShellCallback(overwrite);
		MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
		myBatisGenerator.generate(null);
	}
}
