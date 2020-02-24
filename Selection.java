public class Selection{
    public static void main(String args[]){
        int[] sort = {8,9,5,7,4,12,90};
        int min = 0;
        int minIndex = 0;
        int minValue = 0;
        int temp = 0;
        
        System.out.print("Before Sorting: ");
        for(int i = 0;i<sort.length;i++){
            if(i==sort.length-1){
                System.out.print(sort[i]);
            }
            else{
                System.out.print(sort[i] + ", ");
            }
        }//end for-loop
        /** Sorting algorithm starts here **/
        for(int i = 0;i<sort.length;i++){
            minIndex = i; //sets first unsorted element index as minIndex
            min = sort[minIndex]; //sets first unsorted element as min value
            for(int j = i+1;j<sort.length;j++){
                if(sort[j]<min){ //set new min if smaller value if found
                    minIndex = j;
                    min = sort[minIndex];
                }
            }//end nested for-loop
            //Swap elements
            temp = min;
            sort[minIndex] = sort[i];
            sort[i] = temp;
        }//end for loop
        System.out.print("\n After Sorting: ");
        for(int i = 0;i<sort.length;i++){
            if(i==sort.length-1){
                System.out.print(sort[i]);
            }
            else{
                System.out.print(sort[i] + ", ");
            }
        }//end for-loop
    }//end main method
}//end class