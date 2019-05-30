package com.sjc.lottery.common.config;

import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Description: lottery
 * Created by s on 2019/5/18 17:50
 */
public class MyWebMvcConfigurer  implements WebMvcConfigurer{
    /**
     * 配置后缀请求
     * /basecommon/src/main/java/priv/sjc/base/config/kaptcha/KaptchaConfig.java
     */
    @Override
    public void configurePathMatch(PathMatchConfigurer configurer) {
//        //开启路径后缀匹配
//        configurer.setUseRegisteredSuffixPatternMatch(true);
        //setUseSuffixPatternMatch 后缀模式匹配
        configurer.setUseSuffixPatternMatch(true);
        //setUseTrailingSlashMatch 自动后缀路径模式匹配
        configurer.setUseTrailingSlashMatch(true);
    }

}
