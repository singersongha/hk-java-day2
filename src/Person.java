public class Person {
    // class 틀
    // Person 틀 이름
    // 안에서 갖는 변수 = 필드(f)
//    전역변수
    String name = "우재남";
    int age = 30;

    // 메서드 method
//    자바스크립트에서는
//    const toCustomString = (name, age) => {
//      return "name : " + name + ", age : " + age;
//    }
//    public 리턴타입 메서드명(){구현}
    public String toCustomString(){
        //지역변수
        int agePlus1 = age + 1;
        return "name : " + name + ", age : " + agePlus1;
    }
//
//    public void print() {
//        System.out.println(toCustomString());
//    }

    //생성자(constructor)를 만들자
//    AllArgumentConstructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // overloading 이름은 같은데 argument를 다르게 설계해 재사용성을 늘리는 것
    public Person(String name) {
        this.name = name;
        this.age = 0;
    }

    public Person(int age) {
        this.name = "";
        this.age = age;
    }

    // 이미 있는 것을 바꾸는 것 : overriding @Override

}
