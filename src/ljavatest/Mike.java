package ljavatest;

public class Mike extends Food{
    private Food name ;

    public Mike(Food name){
        this.name = name ;
    }

    public String make(){
        return name.make() +"奶油";
    }
    public void sum (){
        System.out.println("张三");
    }
}
