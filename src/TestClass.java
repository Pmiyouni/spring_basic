public class TestClass {
   /*
   * class가 가지고 있는 자원
   *  - 필드(field) : 속성값, 해당 자원이 가질수 있는 구체적 정보(이름, 비번, 아이디 등)
   *  - 생성자(constructor): 해당 클래스 객체(인스턴스)를 만들때 정의하는 규칙
   *  - 메서드(method) : 특정 기능을 수행하기 위한 코드 블록
    */
    private  int num;
    private String name;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //매서드
    public TestClass(int num, String name) {
        this.num = num;
        this.name = name;
    }

    //생성자
    public TestClass() {
    }

    //매서드
    public  String testMethod1() {
        return "안녕하세요";
    }
}
