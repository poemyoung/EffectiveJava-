package AgencyPattern.DynamicProxy;

import java.lang.reflect.InvocationHandler;

/**
 * 客户类，负责调用
 */
public class Client  {
    public static void main(String[] args) {
        //真实角色
        Owner owner = new Owner();

        //代理角色： 现在没有
        ProxyInvocationHandler test = new ProxyInvocationHandler();
        //通过调用程序处理角色来处理我们要用的接口对象
        //用代理角色处理程序来实现代理角色
        //将要被代理的接口传入对象中
        test.setRent(owner);
        //返回代理类，通过反射动态生成
        Rent o = (Rent)test.getPorxy();

        o.rent();
    }
}
