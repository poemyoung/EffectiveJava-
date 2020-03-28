package AgencyPattern.StaticProxy;

/**
 * 每次上课都要带一本书过去，对于同一门课，不需要每节课都去找书
 * 实际类，带一本书
 */
public class TakeBook implements Book{
    //表示一本书
    private String bookName;

    public TakeBook(String bookName) {
        this.bookName = bookName;
        System.out.println("把"+bookName+"放进书架");
    }

    //表示找书这个动作
    @Override
    public void findBook() {
        System.out.println("寻找"+bookName);
    }
}
