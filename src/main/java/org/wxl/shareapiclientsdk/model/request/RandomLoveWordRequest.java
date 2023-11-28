package org.wxl.shareapiclientsdk.model.request;

import lombok.experimental.Accessors;
import org.wxl.shareapiclientsdk.model.enums.RequestMethodEnum;
import org.wxl.shareapiclientsdk.model.params.RandomLoveWordParams;
import org.wxl.shareapiclientsdk.model.response.RandomLoveWordResponse;

/**
 * @author 16956
 */
@Accessors(chain = true)
public class RandomLoveWordRequest extends BaseRequest<RandomLoveWordParams, RandomLoveWordResponse>{

    @Override
    public String getMethod() {
        return RequestMethodEnum.GET.getValue();
    }

    @Override
    public String getPath() {
         return "/random/loveWord";
    }

    @Override
    public Class<RandomLoveWordResponse> getResponseClass() {
        return RandomLoveWordResponse.class;
    }
}
