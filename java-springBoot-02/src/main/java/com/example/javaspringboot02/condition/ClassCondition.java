package com.example.javaspringboot02.condition;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.util.MultiValueMap;

import java.util.List;
import java.util.Map;

public class ClassCondition implements Condition {


    /**
     * @param context 上下文对象。用于获取环境，IOC容器，ClassLoader对象
     * @param 注解元对象 可以用于获取注解定义的属性值
     *
     * */
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        // 需求是导入jedis坐标后才创建Bean,这里判断`redis.clients.jedis.Jedis` 文件是否存在
//        boolean flag = true;
//        try {
//            Class<?> cls = Class.forName("redis.clients.jedis.Jedis");
//        } catch (ClassNotFoundException e ) {
//            flag = false;
//        }
//        return flag;
        // 导入任意坐标后可以创建Bean
        Map<String, Object> map = metadata.getAnnotationAttributes(ConditionOnClass.class.getName());
        String[] list =(String[]) map.get("value");


        boolean flag = true;
        try {
            for (String className : list) {
                Class<?> cls = Class.forName(className);
            }
        } catch (ClassNotFoundException e ) {
            flag = false;
        }
        return flag;

    }
}
