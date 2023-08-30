import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("hello world");
        System.out.println("hello");
// soutm : 현재 작업중인 class.method 이름을 표시(소속)
        System.out.println("Main.main");
// soutp : 매개변수의 값 출력
        System.out.println("args = " + Arrays.toString(args));

        for (int i = 2; i <= 9; i++) {
// soutv :직전에 선언된 변수값 출력할 때
            System.out.println("i = " + i);

            System.out.println(i + "단");
            for (int j = 1; j <= 9; j++) {
                System.out.print(i + "*" + j + "=" + i * j + "\t");
            }
            System.out.println();
        }

       // TestClass 의 testMethod1을 호출하고 호출결과 출력
        //TestClass의 객체 생성
        //기본생성자로
        TestClass t1 = new TestClass();

        //teatClass의 객체에 num, name 필드값 지정하기(set)
        //값 지정전에 필드값 확인(get)
        System.out.println(t1.getNum());
        System.out.println(t1.getName());

        t1.setNum(100);
        t1.setName("성명");
        System.out.println(t1.getNum());
        System.out.println(t1.getName());



        //매개변수가 있는 생성자로 객체 만들기
        TestClass t2 = new TestClass(10, "이름");
        System.out.println(t2.getNum());
        System.out.println(t2.getName());

        //필드값 변경하기
        t2.setNum(1000);
        t2.setName("이름 333");
        System.out.println(t2.getNum());
        System.out.println(t2.getName());

        System.out.println(t1.testMethod1());
    }
}