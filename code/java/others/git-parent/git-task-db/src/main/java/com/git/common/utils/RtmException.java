package com.git.common.utils;


/**
 * Created by wx:LittleB726  on 2019/12/05.
 */
public class RtmException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public RtmException() {
        super();
    }

    public RtmException(String message) {
        super(message);
    }

    public RtmException(Throwable cause) {
        super(cause);
    }

    public RtmException(String message, Throwable cause) {
        super(message, cause);
    }
}
