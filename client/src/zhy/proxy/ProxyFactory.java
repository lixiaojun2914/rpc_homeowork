package zhy.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class ProxyFactory {

    @SuppressWarnings("unchecked")
    public static <T> T create(Class<T> c, String ip, int port) {

        InvocationHandler handler = new RpcProxy(ip, port, c);

        return (T) Proxy.newProxyInstance(c.getClassLoader(),new Class[] {c},handler);
    }
}