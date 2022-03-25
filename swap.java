public class swapingTwonumbers {
    public static void main(String [] args) {
       int x = 10;
       int y =20;
       System.out.println("before swap");
       System.out.println("x value:"+x);
       System.out.println("y value:"+y);
       x=x+y;
       y=x-y;
       x=x-y;
       System.out.println("after swap");
       System.out.println("x value:"+x);
       System.out.println("y value:"+y); 
       
       
    }
}