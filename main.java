 class A{
 void Adisplay()
{
 System.out.println("A class display method");
}
void Ashow(){
 System.out.println("A class show method");
}
void print()
{
System.out.println("A class print method");
}
}

class B extends A{
 void Bdisplay()
{
System.out.println("B class dispaly method");
}
 void Bshow()
{
 System.out.println("B class show method");
}
void print()
{
 System.out.println("B class print method");
}
}
class C extends B{
void Cdisplay()
{
 System.out.println("c class display method");
}
void Cshow(){
 System.out.println("C class show method");
}
void print()
{
System.out.println("C class print method");
}
}
 public class main{
public static void main(String[] args)
{
A ob1=new A();
ob1.Adisplay();
B ob2=new B();
ob2.Bdisplay();
C ob3=new C();
ob3.Cdisplay();
ob2.print();
}
}
