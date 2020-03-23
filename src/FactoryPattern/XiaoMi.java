package FactoryPattern;

/**
 * 小米手机，产自中国
 */
public class XiaoMi implements MobilePhone {
    @Override
    public String showPlace() {
        return "China";
    }
}
