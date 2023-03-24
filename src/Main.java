public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(tryIt());

    }

    public static  String tryIt() {
        String answer = 4 > 5 ? "pass" : "fail";
        for(int i = 0; i< 10;){
            i++;
        }
        return  answer;
    }

}
