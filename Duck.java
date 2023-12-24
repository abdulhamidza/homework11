public class Duck extends Animal implements Moveable,Flyable,Swimmable {
    public Duck(String name) {
        super(name);
    }
    @Override
  public void swim(){
        System.out.println("duck swims");
    }
@Override
 public void fly(){
    System.out.println("duck fly");
}
@Override
 public void move(){
    System.out.println("duck move");
}

}
