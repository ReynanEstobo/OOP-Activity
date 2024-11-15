public class Encapsualtion {
    public static void main(String[] args){
        Book book1 = new Book();
        book1.bookNum(1);
        book1.bookName("Holy Bible");
        book1.bookPrice(500.0);
       

        System.out.println("Book Num: " + book1.getNum());
        System.out.println("Book Title: " + book1.getName());
        System.out.println("Book Price: " + book1.getPrice());
    }

}
