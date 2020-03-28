package AgencyPattern;

/**
 * 代理类，帮助完成找书这个动作
 */
public class TakeBookProxy implements Book {
   private String bookName;
   private Book find;
    public TakeBookProxy(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public void findBook() {
        if(find == null){
            find = new TakeBook(bookName);
        }
        System.out.println("走进书架");
        find.findBook();
       System.out.println("拿走书");
    }
}
