package LeetCode.LeetCode_Problems;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

import static java.lang.Double.parseDouble;
import static java.lang.System.in;
import static java.lang.System.out;

/*
 *   Author : Aritra
 *   Created On: Sunday,29.06.2025 02:40 pm
 */
public class Leetcode_01_Two_Sum {
    public static void main(String[] args) {
        FastIO sc = new FastIO();
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] nums = sc.readIntArray(n);

        out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }

        return new int[]{-1, -1};
    }





    static class FastIO extends PrintWriter{
        private InputStream stream;private byte[]buf=new byte[1<<16];
        private int curChar,numChars;public FastIO(){this(in, System.out);}
        public FastIO(InputStream i,OutputStream o){super(o);stream=i;}
        public FastIO(String i,String o)throws IOException{super(new FileWriter(o));stream=new FileInputStream(i);}
        private int nextByte(){if(numChars==-1)throw new InputMismatchException();if(curChar>=numChars){curChar=0;try{numChars=stream.read(buf);}catch(IOException e){throw new InputMismatchException();}if(numChars==-1)return -1;}return buf[curChar++];}
        public String nextLine(){int c;do{c=nextByte();}while(c<='\n');StringBuilder res=new StringBuilder();do{res.appendCodePoint(c);c=nextByte();}while(c>'\n');return res.toString();}
        public String next(){int c;do{c=nextByte();}while(c<=' ');StringBuilder res=new StringBuilder();do{res.appendCodePoint(c);c=nextByte();}while(c>' ');return res.toString();}
        public int nextInt(){int c;do{c=nextByte();}while(c<=' ');int sgn=1;if(c=='-'){sgn=-1;c=nextByte();}int res=0;do{if(c<'0'||c>'9')throw new InputMismatchException();res=10*res+c-'0';c=nextByte();}while(c>' ');return res*sgn;}
        public long nextLong(){int c;do{c=nextByte();}while(c<=' ');long sgn=1;if(c=='-'){sgn=-1;c=nextByte();}long res=0;do{if(c<'0'||c>'9')throw new InputMismatchException();res=10*res+c-'0';c=nextByte();}while(c>' ');return res*sgn;}
        public double nextDouble(){return parseDouble(next());}
        public int[] readIntArray(int n){int[]arr=new int[n];for(int i=0;i<n;i++){arr[i]=nextInt();}return arr;}
    }

}
