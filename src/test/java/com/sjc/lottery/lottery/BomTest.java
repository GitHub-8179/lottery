package com.sjc.lottery.lottery;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BomTest {

	public static void main(String[] args) {
		System.out.println("2019-05-25(六)".substring(0,10));
		List<String> warnings = new ArrayList<String>();
		boolean overwrite = true;
		File configFile = new File("src/main/resources/bom.xml");
		ConfigurationParser cp = new ConfigurationParser(warnings);
		Configuration config;
		try {
		config = cp.parseConfiguration(configFile);

		DefaultShellCallback callback = new DefaultShellCallback(overwrite);
		MyBatisGenerator myBatisGenerator;
		try {
		myBatisGenerator = new MyBatisGenerator(config, callback,
		warnings);
		myBatisGenerator.generate(null);

		System.out.println("============          生成文件成功！               ===================");
		} catch (Exception e) {

		e.printStackTrace();
		}

		} catch (IOException e) {
		e.printStackTrace();
		} catch (XMLParserException e) {
		e.printStackTrace();
		}
	}
}
