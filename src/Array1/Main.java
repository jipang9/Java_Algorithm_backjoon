package Array1;

import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
//    // 10818 번
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int i = Integer.parseInt(br.readLine());
//        int max=-1000001;
//        int min=1000001;
//        StringTokenizer st = new StringTokenizer(br.readLine()," ");
//        while(st.hasMoreTokens()){
//            int num = Integer.parseInt(st.nextToken());
//            if(num>max){
//                max=num;
//            }
//            if(num<min){
//                min=num;
//            }
//        }
//        System.out.println(min+ " "+max);

//    // 2562 번
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int max=-1000001;
//        int count=0;
//        int [] arr= new int[9];
//
//        for(int i=0; i<9; i++){
//            arr[i]=Integer.parseInt(br.readLine());
//            if(arr[i]>max){
//                max=arr[i];
//                count=i+1;
//            }
//        }
//        System.out.println(max);
//        System.out.println(count);

        // 2577 번
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int A = Integer.parseInt(br.readLine());
//        int B = Integer.parseInt(br.readLine());
//        int C = Integer.parseInt(br.readLine());
//
//        String num = Integer.toString(A * B * C);
//
//        for (int i = 0; i < 10; i++) {
//            int count = 0;
//            for (int j = 0; j < num.length(); j++) {
//                if ((num.charAt(j) - '0') == i) {
//                    count++;
//                }
//            }
//            System.out.println(count);
//        }
    // 3052번
        // 방법 1. HashSet 이용
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        HashSet<Integer> set = new HashSet<Integer>();
//
//        for(int a=0; a<10; a++){
//            set.add(Integer.parseInt(br.readLine())%42);
//        }
//        System.out.println(set.size());

        // 방법 2. 배열 이용
//                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//                int [] arr=new int[10];
//                boolean bl;
//                int count=0;
//                for(int i=0; i<10; i++){
//                    arr[i]=Integer.parseInt(br.readLine())%42;
//                }
//                    for(int j=0; j<arr.length; j++){
//                        bl=false;
//                        for(int k=j+1; k<arr.length; k++){
//                            if(arr[j]==arr[k]){
//                                bl=true;
//                                break;
//                            }
//                        }
//                        if(bl==false){
//                            count++;
//                        }
//                    }
//        System.out.println(count);
    // 1546 번
        // 방법 1. 배열 사용 + sort 메소드 사용
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        double [] arr = new double[Integer.parseInt(br.readLine())];
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//
//        for(int i=0; i<arr.length; i++){
//            arr[i]=Integer.parseInt(st.nextToken());
//        }
//        Arrays.sort(arr);
//        double sum=0;
//        for(int a=0; a<arr.length; a++){
//            sum +=((arr[a]/arr[arr.length-1])*100);
//        }
//        System.out.println(sum/arr.length);
        // 방법 2. 배열 사용
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        double [] arr = new double[Integer.parseInt(br.readLine())];
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//        double max = -100;
//
//        for(int i=0; i<arr.length; i++){
//            arr[i]=Integer.parseInt(st.nextToken());
//            if(arr[i]>max){
//                max = arr[i];
//            }
//        }
//        double sum=0;
//        for(int a=0; a<arr.length; a++){
//            sum = sum+((arr[a]/max)*100);
//        }
//        System.out.println(sum/ arr.length);

    // 8958번
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int A = Integer.parseInt(br.readLine());
//        String [] arr = new String[A];
//        StringBuilder sb = new StringBuilder();
//
//        for(int i=0; i<A; i++) {
//            arr[i]= br.readLine();
//        }
//
//        for(int a= 0; a<A; a++){
//            int count=0;
//            int sum=0;
//            for(int j=0; j<arr[a].length(); j++){
//                if(arr[a].charAt(j)=='O'){
//                    count++;
//                }else{
//                    count=0;
//                }
//                sum=sum+count;
//            }
//            sb.append(sum+"\n");
//        }
//        System.out.println(sb);
    }
}

