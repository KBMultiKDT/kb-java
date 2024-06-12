package _0621_class_basic;

    public class Television {
        // 멤버 변수 (속성)
        String size;
        int price;
        String manufacturer;
        String retailer;

        // 메서드 (기능)
        public void powerOn() {
            System.out.println("The TV is now ON.");
        }

        public void powerOff() {
            System.out.println("The TV is now OFF.");
        }

        public void changeChannel(int channel) {
            System.out.println("Changing channel to: " + channel);
        }

        // 기타 메서드 (getter, setter)
        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        // ... 나머지 getter, setter 생략
    }
