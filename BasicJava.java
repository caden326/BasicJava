import java.util.ArrayList;

public class BasicJava {
    public static void main(String[] args){
        // printNumbers();

        // oddNums();

        // System.out.println(sum(255));

        //array
        // int[] arr1 = {5,8,-3,13,-9};
        // int[] arr2 = {-3,-4,-5};

        // iterateArr(arr1);

        // findMax(arr2);

        System.out.println(getOdds(256));
    }

    public static void printNumbers(){
        for(int i = 1; i< 256; i++){
            System.out.println(i);
        }
    }

    //print odd numbers 
    public static void oddNums(){
        for(int i = 1; i<=255; i+=2){
            System.out.println(i);
        }
    }

    //sum of a number
    public static int sum(int num){
        int total = 0;
        for(int i = 1; i<= num; i++){
            total+= i;
        }
        return total;
    }


    
    public static void iterateArr(int[] inputArr){
        
        //long version


        // for(int i = 0; i< inputArr.length; i++){
        //     System.out.println(inputArr[i]);
        //     inputArr[i] = 5;
        // }
        // System.out.println(Arrays.toString(inputArr));



        //short version
        for(int value: inputArr){
            System.out.println(value);
        }

    }

//max
    public static void findMax(int[] inputArr){
        int max = inputArr[0];
        for(int value: inputArr){
            if(value>max){
                max= value;
            }
        }
        System.out.println(max);
    }

    public static ArrayList<Integer> getOdds(int someNum){
        ArrayList<Integer> result  = new ArrayList<Integer>();
        for(int i = 1; i<=someNum; i+=2){
            result.add(i);
        }
        return result;
    }


}
