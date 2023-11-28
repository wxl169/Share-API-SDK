package org.wxl.shareapiclientsdk.model.response;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author 16956
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class RandomLoveWordResponse extends ResultResponse{
    private static final long serialVersionUID = 3574646449920774115L;
    /**
     * 返回文本信息
     */
    private String content;
    /**
     * 返回的状态码
     */
    private String code;
    /**
     * 返回错误提示信息！
     */
    private String msg;

}
