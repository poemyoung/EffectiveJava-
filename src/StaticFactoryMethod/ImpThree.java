package StaticFactoryMethod;

public class ImpThree {
    int choose = 0;
    public int getChoose(){
        return choose;
    }

    public static ImpThree getInstance() {
        //  返回impThree的子类
        return  new ChildOne();
    }

    public static void main(String[] args) {
        ImpThree test = ImpThree.getInstance();
        System.out.println(test.getChoose());
        //输出结果为1,表明是返回的子类型
    }
}

class ChildOne extends ImpThree{
    int choose = 1;
    @Override
    public int getChoose() {
        return choose;
    }
}
