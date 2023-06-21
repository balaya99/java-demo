class student {
    int age;
    String school;
    String email;
    student(int age,String school,String email){
      this.age=age;
      this.school= school;
      this.email= email;

    }
}
class kamal extends student{
    int marks;
    kamal(int age,String school,String email, int marks){

      super (age, school, email);
      this.marks= marks;
    }
}
public class Example {
    public static void main(String[] args) {
        kamal obj = new kamal(23,"wesli","abcd", 78);
        System.out.println(obj.marks);

    }
}

/**
 *
 * ddd
 * hhhh
 * jjjj
 * kk
 */



//super()
//super(...)