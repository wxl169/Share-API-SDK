package org.wxl.shareapiclientsdk.client;


import cn.hutool.core.util.RandomUtil;
import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpResponse;
import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONUtil;
import org.wxl.shareapiclientsdk.model.User;

import java.util.HashMap;
import java.util.Map;

import static org.wxl.shareapiclientsdk.utils.SignUtils.genSign;


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



//    public String getNameByGet(String name) {
//        //可以单独传入http参数，这样参数会自动做URL编码，拼接在URL中
//        HashMap<String, Object> paramMap = new HashMap<>();
//        paramMap.put("name", name);
//        String result = HttpUtil.get(GATEWAY_HOST + "/api/name/", paramMap);
//        System.out.println(result);
//        return result;
//    }
//
//    public String getNameByPost(String name) {
//        //可以单独传入http参数，这样参数会自动做URL编码，拼接在URL中
//        HashMap<String, Object> paramMap = new HashMap<>();
//        paramMap.put("name", name);
//        String result = HttpUtil.post(GATEWAY_HOST + "/api/name/post", paramMap);
//        System.out.println(result);
//        return result;
//    }
//
//    public String getUsernameByPost( User user) {
//        String json = JSONUtil.toJsonStr(user);
//        HttpResponse httpResponse = HttpRequest.post(GATEWAY_HOST + "/api/name/user")
//                .addHeaders(getHeaderMap(json))
//                .body(json)
//                .execute();
//        System.out.println(httpResponse.getStatus());
//        String result = httpResponse.body();
//        System.out.println(result);
//        return result;
//    }
    private Map<String, String> getHeaderMap(String body) {
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("accessKey", accessKey);
        // 一定不能直接发送
//        hashMap.put("secretKey", secretKey);
        hashMap.put("nonce", RandomUtil.randomNumbers(4));
        hashMap.put("body", body);
        hashMap.put("timestamp", String.valueOf(System.currentTimeMillis() / 1000));
       hashMap.put("sign", genSign(body, secretKey));
        return hashMap;
    }

    public String onlineInvoke(String parameters, String url) {
        HttpResponse httpResponse = HttpRequest.post(GATEWAY_HOST + url)
                .addHeaders(getHeaderMap(parameters))
                .body(parameters)
                .execute();
        System.out.println(httpResponse.getStatus());
        String result = httpResponse.body();
        return result;
    }

}
