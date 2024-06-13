package _0701_casting_basic.basic_q3_casting;

public class Main {
    public static void main(String[] args) {
        GenericStack<String> stack = new GenericStack<>();
        stack.push("홍길동");
        stack.push("김길동");
        stack.push("박길동");
        stack.push("정길동");
        String pop_result = stack.pop();
        System.out.println("pop()결과>> " + pop_result);

        System.out.println("전체 목록>> " + stack.getList());
        System.out.println("비어있는지 여부>> " + (stack.isEmpty() ? "비었음" : "안비었음"));
        String peek_result = stack.peek();
        System.out.println("peek()결과>> " + peek_result);

        //정수데이터(100, 90, 70, 99)를 넣어 맨 첫번째 숫자를 삭제 후, 전체 점수 리스트 출력
        //비었는지 확인하여 출력
        //현재 stack 가장 위에 있는 데이터를 출력
    }
}

