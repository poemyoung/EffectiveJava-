package EqualsOvd;

import java.util.*;

public class Movie {

    //允许为空值（假如）
    private String name = null;
    private double grades  = 0;
    private int markGivers = 0;
    public Movie(String name,double grades,int markGivers){
        this.name = name;
        this.markGivers = markGivers;
        this.grades = grades;
    }
    public Movie(){

    }

    @Override
    public String toString() {
        return "电影名："+name+'\n'+"评分："+grades+"评分人数："+markGivers;
    }

    @Override
    public boolean equals(Object obj) {
        //比较obj是否为这个对象的饮用
        //性能优化的一种方案，如果比较很耗时就很值得
        if(obj == this){
            return true;
        }
        //参数类型检查，如果出错就返回false
        if(!(obj instanceof Movie)){
            return false;
        }
        //将参数转化为正确的类型
        Movie test = (Movie)obj;
        //检查并返回
        //判断是否为空再调用equals，否则抛出异常
        //(this.name == null?test.name == null:this.name.equals(test.name))
        //现在已经有替代方法Objects.equals();
        return (Objects.equals(this.name, test.name))&&this.markGivers==test.markGivers
                &&(Double.compare(this.grades,test.grades)==0);

    }

    @Override
    public int hashCode() {
        //将result赋一个初值
        //迭代进行更新result = 31 *result+c
        int result = markGivers;
        //对于name
        result = 31 * result + this.name.hashCode();
        //对于double
        //用于存储double转换中途的结果
        long f = 0;
        Double.doubleToLongBits(f);
        result = 31 * result + (int)(f ^ (f >>> 32));
        return result;
    }

    public static void main(String[] args) {
        Movie one = new Movie("双子杀手",6.9,262921);
        Movie two = new Movie("双子杀手",6.9,262921);
        Movie three = new Movie("倚天屠龙记",5.8,296484);
        Movie four = new Movie();
        Movie five = new Movie("双子杀手",6.9,262921);
        //自反性测试
        System.out.println(one.equals(one));//返回true,通过
        //对称性测试
        System.out.println(two.equals(one)&&one.equals(two));//返回true,通过
        //传递性测试
        System.out.println(one.equals(two)&&two.equals(five)&&one.equals(five));//返回true，通过
        //空值测试
        System.out.println(one.equals(four));//不报错返回false，通过
        //HashMap测试
        Map<Movie,String> test = new HashMap<Movie,String >();
        test.put(one,"测试用例");
        System.out.println(test.get(two));  //返回测试用例
        //集合测试
        Set<Movie> test2 = new HashSet<>();
            test2.add(one);
            test2.add(two);
            System.out.println(test2.size());
            //输出1,表示two无法被加入集合中
    }
}
