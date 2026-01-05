package number_system;

public class BinToDecimal {

    public int conversion(int binNum){
        int ans=0;
        int pow=1;

        while(binNum > 0){
            int rem= binNum % 10;
            ans += rem * pow;
            binNum= binNum/10;
            pow = pow *2;
        }
        return ans;
    }

    public static void main(String[] args){
        int binNum;
        BinToDecimal bd = new BinToDecimal();
        System.out.println("Binary Number : " +bd.conversion(1100101));
    }


}
