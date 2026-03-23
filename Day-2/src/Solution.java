import  java.util.Scanner;
public class Solution {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(); 
        int a=0;
        for(int i=0 ;i<s.length();i++)
        {
            int x=s.charAt(i)-'0';
            if(x%2==0)
                a++;
        }
        int[] ar=new int[s.length()];
        if(a>1){
            for(int i=0;i<s.length()&&i<a;i++){

            }
        }


    }
}