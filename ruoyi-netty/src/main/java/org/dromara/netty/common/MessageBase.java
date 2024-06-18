package org.dromara.netty.common;

import lombok.Getter;
import lombok.Setter;

/**
 * @author LeGreen
 * @date 2021/12/25
 */
@Getter
@Setter
public class MessageBase {

    private String clientId;

    private int cmdType;

    private String data;
}
