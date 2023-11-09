package org.wxl.shareapiclientsdk;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.wxl.shareapiclientsdk.client.ShareApiClient;

/**
 * Share-API 客户端配置
 * @author 16956
 */
@Configuration
@ConfigurationProperties("shareapi.client")
@Data
@ComponentScan
public class ShareApiClientConfig {

    private String accessKey;

    private String secretKey;

    @Bean
    public ShareApiClient yuApiClient() {
        return new ShareApiClient(accessKey, secretKey);
    }

}
