package number_system;

public class DecToBin {

    int ans = 0;
    int pow = 1;

    public int conversion(int decNum) {
        while (decNum > 0) {
            int rem = decNum % 2;
            decNum = decNum / 2;

            ans += rem * pow;
            pow = pow * 10;
        }
        return ans;
    }

    public static void main(String[] args){
        int decNum;
        DecToBin db = new DecToBin();
        System.out.println("The binary no is" +db.conversion(50));
    }

}