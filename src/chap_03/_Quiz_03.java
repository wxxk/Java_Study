package chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        // 풀이
        // String num = "901231-1234567";
        // System.out.println(num.substring(0,8));

        // 정답
        String id = "901231-1234567"; // 주민등록번호 13자리
        System.out.println(id.substring(0, 8)); // 0 위치부터 8 위치 직전까지
        id = "030708-4567890"; // 주민등록번호 13자리
        System.out.println(id.substring(0, id.indexOf("-") + 2));   // 0 위치부터 하이픈 위치 + 2 직전까지
    }
}
