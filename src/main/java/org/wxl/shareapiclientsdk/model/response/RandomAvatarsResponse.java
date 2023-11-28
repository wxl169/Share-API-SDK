package org.wxl.shareapiclientsdk.model.response;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author 16956
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class RandomAvatarsResponse extends ResultResponse{
    private static final long serialVersionUID = 464430754434486465L;

    /**
     * 图片地址
     */
    private String	imgurl;
}
