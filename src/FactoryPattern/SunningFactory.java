package FactoryPattern;

/**
 * 苏宁易购，负责卖手机
 */
public class SunningFactory {

    //无构造方法，直接取

    //拿一部苹果手机
    public static MobilePhone getApple(){
        Apple apple= new Apple();
        return apple;
    }
    //拿一部小米手机
    public static MobilePhone getXiaoMi(){
        XiaoMi xiaoMi = new XiaoMi();
        return xiaoMi;
    }
    //拿一部三星手机
    public static MobilePhone getSamSung(){
        SamSung samSung = new SamSung();
        return samSung;
    }
}
