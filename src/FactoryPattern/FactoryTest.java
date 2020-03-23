package FactoryPattern;

/**
 * 测试方法
 */
public class FactoryTest {
    public static void main(String[] args) {
        //买一部苹果手机
        MobilePhone myPhone = SunningFactory.getApple();
        //查看生产厂家
        System.out.println(myPhone.showPlace());
    }

}
