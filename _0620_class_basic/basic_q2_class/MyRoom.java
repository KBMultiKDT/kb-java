package _0620_class_basic.basic_q2_class;

public class MyRoom {
    public static void main(String[] args) {
        TV myTv = new TV();
        myTv.ch = 100;
        myTv.vol = 50;
        myTv.onOff = true;
        System.out.println(myTv);

        TV yourTv = new TV();
        yourTv.ch = 100;
        yourTv.vol = 50;
        yourTv.onOff = true;
        System.out.println(yourTv);
    }
}
