//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
//        String[] names = {"우재남", "서종호", "김석필"};
//        Integer[] ages = {30, 23, null};
         // 참조형 변수의 특징 1. 맨 앞은 대문자 2. int-> Integer 쓰면 null 사용가
//      기본 생성자
//        Person person = new Person();
//        person.name = "최승혁";
//        person.age = 19;
//
//        System.out.println(person.toString()); // 주소가 출력됨
//        System.out.println(person); // 주소가 출력됨
//        // name: 최승혁, age: 19 로 출력되게 하고 싶음
//
//        System.out.println(person.toCustomString());
//        System.out.println(person.print());

//        Food food = new Food();
//        food.menu = "햄버거";
//        food.price = 5600;
//        food.materials = new String[]{"빵", "샐러드", "패티"};
//        food.print();
//
        Person p1 = new Person("김", 8);
        System.out.println(p1.name);
        System.out.println(p1.age);

    }
}