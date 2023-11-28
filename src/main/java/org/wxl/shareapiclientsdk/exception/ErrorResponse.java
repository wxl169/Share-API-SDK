package org.wxl.shareapiclientsdk.exception;

import lombok.Data;

/**

 * @author 16956
 * @Description:
 */
@Data
public class ErrorResponse {
    private String message;
    private int code;
}
