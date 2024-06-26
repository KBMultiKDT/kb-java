package _0625_static_basic.basic_q2_static;

    public class Main {
        public static void main(String[] args) {
            Day study = new Day("자바공부", 10, "강남");
            Day travel = new Day("여행", 15, "강원도");
            Day exercise = new Day("운동", 11, "피트니스");

            System.out.println("전체 하는 일의 시간은: " + Day.getTotalHours() + "시간");
            System.out.println("평균 하는 일의 시간은: " + Day.getAverageHours() + "시간");
            System.out.println();

            System.out.println("매일 무엇을 얼마나 어디에서 했는지 프린트:");
            System.out.println(study);
            System.out.println(travel);
            System.out.println(exercise);
        }
    }

