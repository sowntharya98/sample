import java.io.*;
abstract class Area
{
  int r=15;
  double area;
  abstract void area_calc();
}
 class Circle extends Area
  {
   double pi=3.14;
   void area_calc(){area=pi*r*r;
                    System.out.println("area of circle is"+area);}
    }
 
 class Rectangle extends Area
  {
    int b=17;
   void area_calc(){area=r*b;
                    System.out.println("area of rectangle is"+area);}
    }
 class Square extends Area
  {
   void area_calc(){area=r*r;
                    System.out.println("area of square is"+area);}
    }
 class Triangle extends Area
   {
    int b=20;
    void area_calc(){area=(r*b)/2;
                     System.out.println("area of Triangle is"+area);}
   }
 class Shape
  {
   public static void main(String arge[])
   {
    Area ref;
    Square obj1=new Square();
    Rectangle obj2=new Rectangle();
    Triangle obj3=new Triangle();
    Circle obj4=new Circle();
    ref=obj1;
    ref.area_calc();
    ref=obj2;
    ref.area_calc();
    ref=obj3;
    ref.area_calc();
    ref=obj4;
    ref.area_calc();
   }
}

   