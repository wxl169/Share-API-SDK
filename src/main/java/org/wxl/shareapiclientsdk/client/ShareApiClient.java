package org.wxl.shareapiclientsdk.client;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @author 16956
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShareApiClient {
    private String accessKey;

    private String secretKey;
}
