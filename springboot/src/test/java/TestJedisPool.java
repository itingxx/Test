import com.iting.cart.redis.JedisPoolUtil;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class TestJedisPool {
    private static JedisPool pool = null;

    public static void main(String[] args) {
        pool = JedisPoolUtil.getJedisPool();
        Jedis jedis = pool.getResource();
        System.out.println(jedis.ping());

        jedis.close();



}}
