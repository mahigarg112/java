class Subject {
    int sum(int a, int b){
    return a+b;
    }
}
class BMW extends Subject{
    @Override
    int sum(int a, int b){
        return a+b;

    }
    int display(){
      int v= super.sum(4,5);
    return v;
     
    }
}
class Polymorphism {
    public static void main(String[] args){
       Subject d= new Subject();
       BMW e= new BMW();

 
       System.out.println(d.sum(2,3));
       System.out.println(e.sum(3,3));
       System.out.println(e.display());
    }   
}
