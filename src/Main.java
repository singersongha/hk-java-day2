import franchise.Food;
import franchise.Store;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
//        String[] names = {"우재남", "서종호", "김석필"};
//        Integer[] ages = {30, 23, null};
         // 참조형 변수의 특징 1. 맨 앞은 대문자 2. int-> Integer 쓰면 null 사용가
//      기본 생성자
//        team.Person person = new team.Person();
//        person.name = "최승혁";
//        person.age = 19;
//
//        System.out.println(person.toString()); // 주소가 출력됨
//        System.out.println(person); // 주소가 출력됨
//        // name: 최승혁, age: 19 로 출력되게 하고 싶음
//
//        System.out.println(person.toCustomString());
//        System.out.println(person.print());
//
//        Food food = new Food();
//        food.menu = "햄버거";
//        food.price = 5600;
//        food.materials = new String[]{"빵", "샐러드", "패티"};
//        food.print();

//        team.Team team = new team.Team();
//        team.teamName = "아메리카노";
//        team.goal = "착하게 살자";
//        team.Person p1 = new team.Person();
//        team.Person p2 = new team.Person();
//        team.Person p3 = new team.Person();
//        team.Person p4 = new team.Person();
//        p1.name = "김";
//        p1.age = 8;
//        p2.name = "이";
//        p2.age = 9;
//        p3.name = "박";
//        p3.age = 10;
//        p4.name = "최";
//        p4.age = 21;

//        team.members = new team.Person[]{p1, p2, p3, null};
//        team.memberAdd(p4);
//        team.remove("김");
//
//        team.print();

//        Person2 p = new Person2("asd", 123);
//        p.sound();
//        System.out.println(p.getName());
//        Cat cat = new Cat("dd", 11);
//        cat.sound();

//        Store store = null;
//        store.print();

        Store store1 = new Store("매머드", 9, 19);
        Food f1 = new Food("아메리카노", 1000, new String[]{"샷", "얼음", "물"});
        Food f2 = new Food("라떼", 2000, new String[]{"샷", "얼음", "물"});

        System.out.println(store1.addMenu(f1));
        System.out.println("___");
        store1.addMenu(f2);
        System.out.println("___");
        // 총 수, 총 금액, 평균 올라가야 함
        store1.print();
        // 확인
//        System.out.println(store.getMenuArr());
//        System.out.println(store1.removeMenu("아메리카노"));
//        store1.print();

        }
    }
