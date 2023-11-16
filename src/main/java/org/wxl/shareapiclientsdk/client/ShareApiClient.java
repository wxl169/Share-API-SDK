package org.wxl.shareapiclientsdk.client;


import cn.hutool.core.util.RandomUtil;
import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpResponse;


import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

import static org.wxl.shareapiclientsdk.utils.SignUtils.getSign;


/**
 * @author 16956
 */
public class ShareApiClient {
    private String accessKey;

    private String secretKey;

    public ShareApiClient(String accessKey, String secretKey) {
        this.accessKey = accessKey;
        this.secretKey = secretKey;
    }

    /**
     * 网关端口
     */
    private static final String GATEWAY_HOST = "http://localhost:8090";


    private Map<String, String> getHeaderMap(String body) {
        if (body == null) {
            body = "wxl";
        }
        String encode = null;
        try {
            encode = URLEncoder.encode(body, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }

        Map<String, String> hashMap = new HashMap<>();
        String nonce = RandomUtil.randomNumbers(4);
        String currentTime = String.valueOf(System.currentTimeMillis() / 1000);
        hashMap.put("accessKey", accessKey);
        hashMap.put("nonce", nonce);
        hashMap.put("body", encode);
        //流量染色
        hashMap.put("source", "gateway");
        hashMap.put("timestamp",currentTime);
        hashMap.put("sign", getSign(encode, secretKey, nonce, currentTime));
        return hashMap;
    }

    public String onlineInvoke(String parameters, String url) {
        String endpoint = url.replace("http://localhost:8081", "");
        HttpResponse httpResponse = HttpRequest.post(GATEWAY_HOST + endpoint)
                .addHeaders(getHeaderMap(parameters))
                .body(parameters)
                .execute();
        System.out.println(httpResponse.getStatus());
        return httpResponse.body();
    }

}
