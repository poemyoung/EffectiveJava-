package FactoryPattern;

/**
 * 三星手机，产自韩国
 */
public class SamSung implements MobilePhone {
    @Override
    public String showPlace() {
        return "Korea";
    }
}
