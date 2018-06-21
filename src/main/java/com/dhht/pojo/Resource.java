package com.dhht.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration //代表会引用资源文件
@ConfigurationProperties(prefix="com.dhht")
@PropertySource(value="classpath:cofig.properties")
public class Resource {
	private String path;

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

}
