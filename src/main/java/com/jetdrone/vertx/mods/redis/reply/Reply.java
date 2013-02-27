package com.jetdrone.vertx.mods.redis.reply;

import java.io.IOException;

import com.jetdrone.vertx.mods.redis.RedisDecoder;
import org.jboss.netty.buffer.ChannelBuffer;

public interface Reply<T> {
    byte[] CRLF = new byte[]{RedisDecoder.CR, RedisDecoder.LF};

    T data();

    void write(ChannelBuffer os) throws IOException;

    /**
     * Return the type of instance of this Reply. Useful to avoid checks against instanceof
     * @return enum
     */
    ReplyType getType();
}