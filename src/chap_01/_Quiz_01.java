package chap_01;

public class _Quiz_01 {
    public static void main(String[] args) {
//        String bus_1 = "1234";
//        String bus_2 = "상암08";
//        int arr_bus_1 = 3;
//        int arr_bus_2 = 5;
//        double dis_bus_1 = 1.5;
//        double dis_bus_2 = 0.8;
//
//        System.out.println(bus_1 + "버스");
//        System.out.println("약" + arr_bus_1 + "분 후 도착");
//        System.out.println("남은거리" + dis_bus_1 + "km");
        /*
        (실행 결과)
        상암 08번 버스
        약 3분 후 도착
        남은 거리 1.2km
         */

        // 버스 번호(1234, 상암08)
        String busNo = "상암08";

        // 남은 시간 (3분, 5분)
        int minute = 3;

        // 남은 거리 (1.5km, 0.8km)
        double distance = 1.5;

        // 결과 출력
        System.out.println(busNo + "번 버스");
        System.out.println("약 " + minute + "분 후 도착");
        System.out.println("남은거리 " + distance + "km");
    }
}
