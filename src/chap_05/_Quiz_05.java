package chap_05;

public class _Quiz_05 {
    public static void main(String[] args) {
        // 벼열을 활용하여 쇼핑몰에서 구매 가능한 신발 사이즈 옵션을 출려하는 프로그램

        // 신발 사이즈는 250 부터 295 까지 5 단위로 증가
        // 산발 사이즈 수는 총 10 가지

        // 풀이
        int siz = 250;
        int[] shoes = new int[10];

        for (int i = 0; i < 10; i++) {
            shoes[i] = siz;
            siz+= 5;
        }

        for (int i :
                shoes) {
            System.out.println("사이즈 " + i + " (재고 있음)");
        }

        // 정답
        int[] sizeArray = new int[10];
        for (int i = 0; i < sizeArray.length; i++) {
            sizeArray[i] = 250 + (5 * i);
        }

        for (int size : sizeArray) {
            System.out.println("사이즈 " + size + " (재고 있음)");
        }
    }
}
