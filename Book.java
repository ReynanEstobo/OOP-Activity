public class Book {
    private int book_number;
    private String title;
    private String author;
    private double price;

    public void bookNum(int b_num){
        this.book_number = b_num;
    }
    public void bookName(String b_name){
        this.title = b_name;
    }
    public void bookPrice(double b_price){
        this.price = b_price;
    }

    public int getNum(){
        return book_number;
    }

    public String getName(){
        return title;
    }

    public double getPrice(){
        return price;
    }

}
