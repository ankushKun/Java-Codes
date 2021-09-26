import java.util.*;
class PSEUDO{
    int arp[];
    int n;
    PSEUDO(int n){
        arp = new int[n];
    }

    void fnFill(){
        for(int i=0;i<arp.length;i++){
            Random rn = new Random();
            arp[i] = rn.nextInt(10);
        }
    }

    void fnShow(){
        for(int i=0;i<(int)arp.length/2;i++){
            System.out.println(arp[i]+", "+arp[arp.length-1-i]);
        }
        if(!(arp.length%2==0)){
            System.out.println(2*arp[1+(int)arp.length/2]);
        }
    }
    boolean booleanfnIsPseudo(){
        int prev = arp[0]+arp[arp.length-1];
        for(int i=0;i<(int)arp.length/2;i++){
            if(prev == arp[i]+arp[arp.length-1-i]){
                continue;
            }else{
                return false;
            }
        }
        if(!(arp.length%2==0)){
            if(prev == 2*arp[1+(int)arp.length/2]){
                return true;
            }else{
                return false;
            }
        }
        return true;

    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n : ");
        PSEUDO ps = new PSEUDO(sc.nextInt());
        ps.fnFill();
        ps.fnShow();
        System.out.println(ps.booleanfnIsPseudo());
    }
}
