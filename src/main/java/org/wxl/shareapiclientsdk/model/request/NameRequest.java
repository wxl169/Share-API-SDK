package org.wxl.shareapiclientsdk.model.request;

import lombok.experimental.Accessors;
import org.wxl.shareapiclientsdk.model.enums.RequestMethodEnum;
import org.wxl.shareapiclientsdk.model.params.NameParams;
import org.wxl.shareapiclientsdk.model.response.NameResponse;

/**
 * @author 16956
 * @Version: 1.0
 * @Description:
 */
@Accessors(chain = true)
public class NameRequest extends BaseRequest<NameParams, NameResponse> {

    @Override
    public String getPath() {
        return "/username";
    }

    /**
     * 获取响应类
     *
     * @return {@link Class}<{@link NameResponse}>
     */
    @Override
    public Class<NameResponse> getResponseClass() {
        return NameResponse.class;
    }


    @Override
    public String getMethod() {
        return RequestMethodEnum.GET.getValue();
    }
}
