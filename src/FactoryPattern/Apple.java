package FactoryPattern;

/**
 * 苹果手机，产自美国
 */
public class Apple implements MobilePhone {
    @Override
    public String showPlace() {
        return "America";
    }
}
