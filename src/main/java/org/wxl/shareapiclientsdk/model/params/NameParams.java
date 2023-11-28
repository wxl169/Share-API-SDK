package org.wxl.shareapiclientsdk.model.params;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author 16956
 * @Version: 1.0
 * @Description:
 */
@Data
@Accessors(chain = true)
public class NameParams implements Serializable {
    private static final long serialVersionUID = 3815188540434269370L;
    private String username;
}
