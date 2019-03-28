package com.jt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
//排除数据源的加载项
@SpringBootApplication(exclude=DataSourceAutoConfiguration.class)
@EnableConfigServer		//开启配置中心设置
public class SpringBoot_Run {

	//定义主启动类  //consumer8020启动类
	public static void main(String[] args) {
		//启动SpringBoot程序
		SpringApplication.run(SpringBoot_Run.class, args);
	}
}
