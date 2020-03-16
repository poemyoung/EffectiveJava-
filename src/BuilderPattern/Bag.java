package BuilderPattern;

public class Bag {
    int pen = 0;
    int pencil = 0;
    int book = 0;
    String bagName = null;
    public static class Builder{
        //必填参数
        String bagName = "Garfiled";
        //可选参数
        int pen = 0;
        int pencil = 0;
        int book = 0;
        //Builder构造函数，必须传入必选参数
        public Builder(String bagName){
            this.bagName = bagName;
        }
        //Builder进行调用，this指向调用者
        public Builder setPen(int pen){
            this.pen = pen;
            return this;
        }
        //返回Builder的目的是进行链式调用
        public  Builder setPencil(int pencil){
            this.pencil = pencil;
            return this;
        }
        public  Builder setBook(int book){
            this.book = book;
            return this;
        }
        //通过内部类调用返回已经传入值的Bag类
        public Bag build(){
            if(pen == 0&&pencil==0&&book ==0){
                System.out.println(bagName + "is an empty bag!");
            }
            return new Bag(this);
        }
    }
    //私有构造函数，只给内部类调用
    private Bag(Builder builder){
        this.bagName = builder.bagName;
        this.pen = builder.pen;
        this.pencil = builder.pencil;
        this.book = builder.book;
    }

    public static void main(String[] args) {
        //使用new +.内部类 的方式新建一个公有内部类对象
        Bag a = new Bag.Builder("xzp的书包").setBook(1).setPen(2).setPencil(3).build();
        Bag b = new Bag.Builder("xzp的空书包").build();
        //输出 xzp的空书包is an empty bag!
    }
}
