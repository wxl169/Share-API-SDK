package org.wxl.shareapiclientsdk.service;

import cn.hutool.http.HttpResponse;
import org.wxl.shareapiclientsdk.client.ShareApiClient;
import org.wxl.shareapiclientsdk.exception.ApiException;
import org.wxl.shareapiclientsdk.model.request.*;
import org.wxl.shareapiclientsdk.model.response.PoisonousChickenSoupResponse;
import org.wxl.shareapiclientsdk.model.response.RandomAvatarsResponse;
import org.wxl.shareapiclientsdk.model.response.ResultResponse;


/**
 * @author 16956
 */
public interface ApiService {
    /**
     * 通用请求
     *
     * @param request 要求
     * @return {@link HttpResponse}
     * @throws ApiException 业务异常
     */

    <O, T extends ResultResponse> T request(BaseRequest<O, T> request) throws ApiException;

    /**
     * 通用请求
     *
     * @param shareApiClient Share api客户端
     * @param request     要求
     * @return {@link T}
     * @throws ApiException 业务异常
     */
    <O, T extends ResultResponse> T request(ShareApiClient shareApiClient, BaseRequest<O, T> request) throws ApiException;


    /**
     * 随机毒鸡汤
     *
     * @return {@link PoisonousChickenSoupResponse}
     * @throws ApiException 业务异常
     */
    PoisonousChickenSoupResponse getPoisonousChickenSoup() throws ApiException;

    /**
     * 喝毒鸡汤
     *
     * @param shareApiClient share api客户端
     * @return {@link PoisonousChickenSoupResponse}
     * @throws ApiException 业务异常
     */
    PoisonousChickenSoupResponse getPoisonousChickenSoup(ShareApiClient shareApiClient) throws ApiException;

    /**
     * 随机头像获取
     *
     * @return {@link RandomAvatarsResponse}
     * @throws ApiException 业务异常
     */
    RandomAvatarsResponse getRandomAvatars(ShareApiClient shareApiClient,RandomAvatarsRequest request) throws ApiException;

    /**
     * 随机头像获取
     *
     * @param request share api客户端
     * @return {@link RandomAvatarsResponse}
     * @throws ApiException 业务异常
     */
    RandomAvatarsResponse getRandomAvatars(RandomAvatarsRequest request) throws ApiException;
}
