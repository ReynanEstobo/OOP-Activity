public class dog {
    String name;
    boolean isMale;
                    int numOfPuppy;
    dog puppies[] = new dog[5];

    public void setName(String Name){
        name = Name;
    }

    public void showName() {
        System.out.println(name);
    }

    public void numOfpups(int number){
        numOfPuppy = number;
    } 

    public void puppyNum(){
        System.out.println("There are " + numOfPuppy + " puppies.");
    }
   
   
    public void bark(){
        System.out.println("Woof! Woof!");
    }

    public void setPuppies(String name1, String name2, String name3, String name4){
        dog[] puppies = new dog[]{name1,name2,name3,name4};
    }

    public void showPuppies(){
        for(int i = 0; i < 4; i++){
            System.out.println(dog.puppies);
        }
    }
   

    



}