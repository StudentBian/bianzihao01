package ljavatest;

public class Bread extends Food {
    private Food name ;

    public Bread(Food name){
        this.name = name ;
    }
    public String make(){
         return name.make() +"面包";
    }
}
