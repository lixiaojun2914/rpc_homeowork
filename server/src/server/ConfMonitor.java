package server;

import java.util.HashMap;
import java.util.Map;

import service.impl.HelloImpl;

/**
 * 模拟配置，实际的框架中大部分都是使用xml进行配置的，比如Hessian是配置在web.xml的servlet属性里的
 * @author cdwangzijian
 *
 */
public class ConfMonitor {
    @SuppressWarnings("rawtypes")
    public static Map<String, Class> conf = new HashMap<String, Class>();

    static {
        conf.put("service.IHello", HelloImpl.class);
    }
}