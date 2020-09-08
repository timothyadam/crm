package com.timothy.gateway.config;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
/**
 * @author ：wangxin
 * @date ：Created in 2020/9/8 11:12
 * 网关白名单配置
 */


@Data
@EqualsAndHashCode(callSuper = false)
@Component
@ConfigurationProperties(prefix="secure.ignore")
public class IgnoreUrlsConfig {
    private List<String> urls;
}