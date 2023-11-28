package org.wxl.shareapiclientsdk.service.impl;


import lombok.extern.slf4j.Slf4j;
import org.wxl.shareapiclientsdk.client.ShareApiClient;
import org.wxl.shareapiclientsdk.exception.ApiException;
import org.wxl.shareapiclientsdk.model.request.*;
import org.wxl.shareapiclientsdk.model.response.PoisonousChickenSoupResponse;
import org.wxl.shareapiclientsdk.model.response.RandomAvatarsResponse;
import org.wxl.shareapiclientsdk.service.ApiService;
import org.wxl.shareapiclientsdk.service.BaseService;


/**
 * @author 16956
 * @Description:
 */
@Slf4j
public class ApiServiceImpl extends BaseService implements ApiService {

    @Override
    public PoisonousChickenSoupResponse getPoisonousChickenSoup() throws ApiException {
        PoisonousChickenSoupRequest request = new PoisonousChickenSoupRequest();
        return request(request);
    }

    @Override
    public PoisonousChickenSoupResponse getPoisonousChickenSoup(ShareApiClient shareApiClient) throws ApiException {
        PoisonousChickenSoupRequest request = new PoisonousChickenSoupRequest();
        return request(shareApiClient, request);
    }

    @Override
    public RandomAvatarsResponse getRandomAvatars(RandomAvatarsRequest request) throws ApiException {
        return request(request);
    }

    @Override
    public RandomAvatarsResponse getRandomAvatars(ShareApiClient shareApiClient,RandomAvatarsRequest request) throws ApiException {
        return request(shareApiClient,request);
    }

}
