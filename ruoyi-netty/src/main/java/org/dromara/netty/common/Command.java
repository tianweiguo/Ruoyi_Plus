
package org.dromara.netty.common;

public final class Command {
  public enum CommandEnum {
    /**
     * <pre>
     **
     * 验证
     * </pre>
     *
     * <code>AUTH = 1;</code>
     */
    AUTH(1),
    /**
     * <pre>
     **
     * ping
     * </pre>
     *
     * <code>PING = 2;</code>
     */
    PING(2),
    /**
     * <pre>
     **
     * pong
     * </pre>
     *
     * <code>PONG = 3;</code>
     */
    PONG(12),
    /**
     * <pre>
     **
     * 上传数据
     * </pre>
     *
     * <code>UPLOAD_DATA = 4;</code>
     */
    UPLOAD_DATA(4),
    /**
     * <pre>
     **
     * 推送数据
     * </pre>
     *
     * <code>PUSH_DATA = 5;</code>
     */
    PUSH_DATA(5),
    /**
     * <pre>
     **
     * 验证返回
     * </pre>
     *
     * <code>AUTH_BACK = 11;</code>
     */
    AUTH_BACK(11),
    /**
     * <code>UPLOAD_DATA_BACK = 14;</code>
     */
    UPLOAD_DATA_BACK(14),
    /**
     * <code>PUSH_DATA_BACK = 15;</code>
     */
    PUSH_DATA_BACK(15),
    ;

    public final int value;

    CommandEnum(int value){
      this.value = value;
    }
  }
}
