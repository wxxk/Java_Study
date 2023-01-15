package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
//      String 은 여러글자
        String name = "나도코딩";
        int hour = 15;

        System.out.println(name + "님, 배송이 시작됩니다. " + hour + "시에 방문 예정입니다.");
        System.out.println(name + "님, 배송이 완료되었습니다.");

        double score = 90.5;
//      char 은 한글자
        char grade = 'A';
        name = "이상욱";
        System.out.println(name + "님의 평균 점수는 " + score + "점입니다.");
        System.out.println("학점은 " + grade + "입니다.");

        boolean pass = false;
        System.out.println("이번 시험에 합격했을까요? " + pass);

        double d = 3.14123456789;
        float f = 3.14123456789F;
//      flat에 실수를 사용하면 뒤에 F/f
//      float는 소수점 6째자리까지만 유효함

        System.out.println(d);
        System.out.println(f);

        long l= 1000000000000L;
        l = 1_000_000_000_000L;
//      int형의 범위는 +-21억
//      long에 l/L 을 넣어주어야 long으로 인식
//      _ 표시로 숫자 구분 가능
        System.out.println(l);
    }
}
