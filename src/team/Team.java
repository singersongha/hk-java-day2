package team;

// 4명까지 존재 가능
// 팀 명 아메리카노
// 목표 "착하게 살자"
public class Team {
    Person[] members = new Person[4];
    //    String[] membersName;
//    int[] membersAge;
    String teamName;
    String goal;

    public void print() {
        System.out.println("team.Team Name: " + teamName);
        System.out.println("team.Team Goal: " + goal);
        for (int i = 0; i < members.length; i++) {
            if (members[i] == null) {
                continue;
            }
            System.out.println("Member: " + members[i].name + ", " + members[i].age);

        }
    }

    public void memberAdd(Person p4) {
        for (int i = 0; i < members.length; i++) {
            if (members[i] == null) {
                members[i] = p4;
            } else {
                System.out.println("자리가 없어요.");
            }
        }
    }

    public void remove(String name) {
        for (int i = 0; i < members.length; i++) {
            if (members[i].name == name) {
                members[i] = null;
            }
        }

    }
}
