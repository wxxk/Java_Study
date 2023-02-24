package chap_02;

public class _Quiz_02 {
    public static void main(String[] args) {
        // 풀이
//        int limit = 120;
//        int height = 121;
//
//        String a = (height>=limit) ? "이므로 탑승 가능합니다." : "이므로 탑승 불가능합니다.";
//
//        System.out.println("키가 " + height + "cm " + a);

        // 정답
        // 키가 115cm 이므로 탑승 불가능합니다.
        // 키가 121cm 이므로 탑승 가능합니다.
        int height = 121;
        String result = (height >= 120) ? "탑승 가능합니다" : "탑승 불가능합니다.";
        System.out.println("키가 " + height + "cm 이므로 " + result);
    }
}
