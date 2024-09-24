package team;

    public class Person2 extends Animal{
        private String name;
        private int age;
        private boolean isAdult;
        public Person2(String name, int age) {
            super(name, age);
            this.isAdult = age > 19;
//            this.name = name;
//            this.age = age;
        }

        @Override
        public void sound() {
            System.out.println("안녕");
        }

        public void talk() {
            System.out.println("안녕");

        }





    }

