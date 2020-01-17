import com.alibaba.fastjson.JSON;
import com.git.TaskApplication;
import com.git.common.eum.TypeEum;
import com.git.common.event.ConfigInitializerEvent;
import com.git.common.redis.RedisUtils;
import com.git.common.utils.RtmUtils;
import com.git.task.entity.TUser;
import java.util.UUID;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by wx:LittleB726  on 2019/12/05. 测试用例
 */

@RunWith(SpringRunner.class)
@TestPropertySource(properties = {"spring.profiles.active=dev"})
@SpringBootTest(classes = TaskApplication.class)
@ContextConfiguration(initializers = {ConfigInitializerEvent.class})
public class test {

    @Autowired(required = false)
    private RedisUtils redisUtils;

    @Test
    public void taskDb() {
        /**
         * 对应数据库表名 方便查看
         */

        TypeEum typeEum = TypeEum.getByCode(TypeEum.INSERT.getCode());
        String tableName = RtmUtils.getTableName(TUser.class);

        TUser tUser = new TUser();
        switch (typeEum) {
            case INSERT:
                tUser.setAge(18);
                tUser.setEmail("ubuntu2008@126.com");
                tUser.setId(UUID.randomUUID().toString().replaceAll("-", ""));
                tUser.setMobile("11111111111");
                tUser.setName("张三");
                tUser.setTime(System.currentTimeMillis());
                String keyInsert = TypeEum.INSERT.getListKeyPrefix() + tableName;
                for (int i = 1; i <=10; i++) {
                    redisUtils.rpush(keyInsert, JSON.toJSONString(tUser));
                }
                break;
            case UPDATE:
                tUser.setMobile("12345678901");
                tUser.setName("李四");
                tUser.setEmail("494339424qq.com");
                String keyUpdate = TypeEum.UPDATE.getListKeyPrefix() + tableName;
                redisUtils.rpush(keyUpdate, JSON.toJSONString(tUser));
                break;
        }
    }

}
