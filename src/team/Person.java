package team;

public class Person {
    // class 틀
    // team.Person 틀 이름
    // 안에서 갖는 변수 = 필드(f)
//    전역변수
//    final: 변수 할당 시가 마지막
//    final String name = "우재남";
//    final int age = 30;

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
//    public Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//    public Person() {
//    }

    // overloading 이름은 같은데 argument를 다르게 설계해 재사용성을 늘리는 것
//    public team.Person(String name) {
//        this.name = name;
//        this.age = 0;
//    }
//
//    public team.Person(int age) {
//        this.name = "";
//        this.age = age;
//    }

    // 이미 있는 것을 바꾸는 것 : overriding @Override

//    public - 다 가능 protected - 패키지 다르면 x, (dafault) - 패키지 다르면 x, private - 나 아니면 x
//    상속 extends : 키워드로 animal에 있는 모든 것들을 받아옴, 안에 있는 것은 this, 부모에 있는 것은 super
//    public class Person extends Animal{
////        private String name;
////        private int age;
//
//        public Person(String name, int age) {
//            super(name, age);
////            this.name = name;
////            this.age = age;
//        }
//        public void talk() {
//            System.out.println("안녕");
//        }
//    }
}

