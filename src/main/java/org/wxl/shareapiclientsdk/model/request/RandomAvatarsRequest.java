package org.wxl.shareapiclientsdk.model.request;

import lombok.experimental.Accessors;
import org.wxl.shareapiclientsdk.model.enums.RequestMethodEnum;
import org.wxl.shareapiclientsdk.model.params.RandomAvatarsParams;
import org.wxl.shareapiclientsdk.model.response.RandomAvatarsResponse;

import java.util.Random;

/**
 * @author 16956
 */
@Accessors(chain = true)
public class RandomAvatarsRequest extends BaseRequest<RandomAvatarsParams, RandomAvatarsResponse>{
    @Override
    public String getPath() {
        return "/random/avatars";
    }

    /**
     * 获取响应类
     *
     * @return {@link Class}<{@link RandomAvatarsResponse}>
     */
    @Override
    public Class<RandomAvatarsResponse> getResponseClass() {
        return RandomAvatarsResponse.class;
    }

    @Override
    public String getMethod() {
        return RequestMethodEnum.GET.getValue();
    }
}
