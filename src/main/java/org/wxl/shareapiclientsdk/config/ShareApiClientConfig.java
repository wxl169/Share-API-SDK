package org.wxl.shareapiclientsdk.config;

import lombok.Data;
import org.apache.commons.lang3.StringUtils;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.wxl.shareapiclientsdk.client.ShareApiClient;
import org.wxl.shareapiclientsdk.service.ApiService;
import org.wxl.shareapiclientsdk.service.impl.ApiServiceImpl;


/**
 * @author 16956
 */
@Data
@Configuration
@ConfigurationProperties("share.api.client")
@ComponentScan
public class ShareApiClientConfig {
    /**
     * 访问密钥
     */
    private String accessKey;

    /**
     * 秘密密钥
     */
    private String secretKey;

    /**
     * 网关
     */
    private String host;

    @Bean
    public ShareApiClient shareApiClient() {
        return new ShareApiClient(accessKey, secretKey);
    }

    @Bean
    public ApiService apiService() {
        ApiServiceImpl apiService = new ApiServiceImpl();
        apiService.setShareApiClient(new ShareApiClient(accessKey, secretKey));
        if (StringUtils.isNotBlank(host)) {
            apiService.setGatewayHost(host);
        }
        return apiService;
    }
}
