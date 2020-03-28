package AgencyPattern.DynamicProxy;

/**
 * 房东出租房子
 */
public class Owner implements Rent {

    @Override
    public void rent(){
        System.out.println("房东出租房子");
    }
}
