package org.wxl.shareapiclientsdk.model.response;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author 16956
 * @Version: 1.0
 * @Description:
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class NameResponse extends ResultResponse {
    private static final long serialVersionUID = -1038984103811824271L;
    private String username;
}
