package AgencyPattern.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 用这个类自动生成代理类，动态生成
 * 实现InvocationHandler接口即可
 */
public class ProxyInvocationHandler implements InvocationHandler {

//    Foo f = (Foo) proxyClass.    参数1，实现了InvocationHandler的类的ClassLoader
//            getConstructor(new Class[] { InvocationHandler.class }). //参数2 共同的interface,通过反射获得
//            newInstance(new Object[] { handler });  //Invocation实现类
    //被代理的接口
    private Object rent;

    public void setRent(Object rent){
        this.rent = rent;
    }

    //生成得到代理类
    public Object getPorxy(){
        //返回一个新的代理实例
      return  Proxy.newProxyInstance(this.getClass().getClassLoader(),rent.getClass().getInterfaces(),this);

    }

    //处理代理实例，并返回结果
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //执行方法,方法+参数
        //动态代理的本质，就是使用反射机制
        seeHouse();
        //执行接口的方法（代理的方法）
      Object res =  method.invoke(rent,args);
        return res;
    }

    void seeHouse(){
        System.out.println("看房子");
    }
}
