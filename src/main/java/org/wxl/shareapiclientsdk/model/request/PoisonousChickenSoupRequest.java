package org.wxl.shareapiclientsdk.model.request;

import lombok.experimental.Accessors;
import org.wxl.shareapiclientsdk.model.enums.RequestMethodEnum;
import org.wxl.shareapiclientsdk.model.params.PoisonousChickenSoupParams;
import org.wxl.shareapiclientsdk.model.response.PoisonousChickenSoupResponse;

/**
 * @author 16956
 * @Description:
 */
@Accessors(chain = true)
public class PoisonousChickenSoupRequest extends BaseRequest<PoisonousChickenSoupParams, PoisonousChickenSoupResponse> {

    @Override
    public String getPath() {
        return "/chickenSoup/text";
    }

    /**
     * 获取响应类
     *
     * @return {@link Class}<{@link PoisonousChickenSoupResponse}>
     */
    @Override
    public Class<PoisonousChickenSoupResponse> getResponseClass() {
        return PoisonousChickenSoupResponse.class;
    }

    @Override
    public String getMethod() {
        return RequestMethodEnum.GET.getValue();
    }
}
