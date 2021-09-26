import java.util.*;
public class Number{
    static long num;

    Number(){
        num = 0;
    }
    Number(long n){
        num = n;
    }

    int sumDigits(){
        int sum=0;
        for(long i=num;i>0;i/=10){
            sum+=i%10;
        }
        return sum;
    }

    void digitFrequency(){
        //for ints 0-9
        int freq[] = {0,0,0,0,0,0,0,0,0,0};
        for(long i=num;i>0;i/=10){
            freq[(int)(i%10)]++;
        }
        for(int i=0;i<10;i++){
            if(freq[i]>0){
                System.out.println("Frequency of "+i+" : "+freq[i]);
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Number numb = new Number(1223334444);
        numb.digitFrequency();
        System.out.println("Sum of digits of "+numb.num+" : "+numb.sumDigits());


    }
}
