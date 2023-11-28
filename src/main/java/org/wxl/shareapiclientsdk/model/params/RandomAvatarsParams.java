package org.wxl.shareapiclientsdk.model.params;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 16956
 */
@Data
public class RandomAvatarsParams implements Serializable {
    private static final long serialVersionUID = 8266590560380038744L;

    /**
     * 选择输出分类[男|女|动漫男|动漫女]，为空随机输出
     */
    private String 	sort;
    /**
     * 选择输出格式[json|images]
     */
    private String format;
}
