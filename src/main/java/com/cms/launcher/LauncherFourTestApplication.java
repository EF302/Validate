package com.cms.launcher;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/*基础主包设置为“com.cms",是因为鲜哥编写的jar包中的某些类中的属性也需要自动注入，如：SponsorController extends BaseController，
    BaseController中就有属性需要自动注入，而该类所在包名为：com.cms.common.controller。同理，dao层也存在继承关系，也可能需要自动注入，
    故扫描配置时，设置为：com.cms.*.dao*/
@SpringBootApplication(scanBasePackages = "com.cms.*")
@MapperScan("com.cms.*.dao")
public class LauncherFourTestApplication {

    private static ConfigurableApplicationContext context;

    public static void main(String[] args) {
        SpringApplication.run(LauncherFourTestApplication.class, args);
    }
}
