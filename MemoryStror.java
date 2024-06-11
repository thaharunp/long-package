class Parent1{

}
class Child extends Parent1{

}
class MemoryStrore{
    public static void main(String args[]){
        Parent1 p1 = new Parent1();
        Child c1 = new Child();
        int a =10;
        int b = 20;
        int c= 10;
        String s1 = new String("thaharun");
        String s2 = "thaharun";
        String s3 = "thaharun";
        String s4 = new String("thaharun");

       // System.out.println(a.equal());          // int cannot be deferenced
      // System.out.println(p1.equal(c1));            // connot find the simble
      //  System.out.println(s1.equal(s2));
        System.out.println(a==b);             //false
        System.out.println(a==c);                   // true
        System.out.println(s1==s4);
        //System.out.println(s2==s3);              //java.lang.ClassNotFoundException:
        //System.out.println(s2==s4);           //java.lang.ClassNotFoundException:

       // System.out.println(p1==s1);            parent and String
       System.out.println(p1==c1);
       System.out.println(s1==s4);
       System.out.println(s1==s2);

    }
}