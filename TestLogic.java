public class TestLogic {
    public static void main(String[] args){
        /*
         > มากกว่า
         < น้อยกว่า
         == เท่ากับ 
         >= มากกว่าเท่ากับ
         <= น้อยกว่าเท่ากับ
         |= ไม่เท่ากับ 
         */

    
    int x = 6, y = 9;
    System.out.println(x > y);
    System.out.println(x < y);
    System.out.println(x >= y);
    System.out.println(x == y);
    System.out.println(x |= 6);
    System.out.println((x < y) && (y > 3));
    System.out.println((x == 5) || (y > 2));
    System.out.println((y > x));
      }
    }
