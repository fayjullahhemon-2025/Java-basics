package milestone_1;

public class lec_4_array {
    public static void main(String[] args){
        //syntax : datatype[] array_name = {elements}

        int[] arr1 = {1,2,3,4};
        System.out.println(arr1);//display array address
        System.out.println(arr1[0]);//display first index(first element)
        //user can display all elements using loop
        for(int i =0;i<4;i++){
            System.out.println(arr1[i]);
        }
    }
}
