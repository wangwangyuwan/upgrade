package github.yuwan.jedisinstance.lock;

import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;

/**
 * Todo
 *
 * @author wwyw
 * @since
 */
@Component
public class DistributedLock {

    private Jedis jedis;

    public DistributedLock(Jedis jedis) {
        this.jedis = jedis;
    }

}
