import org.jetbrains.annotations.NotNull;

public class BubbleSort {

    public static int[] bubbleSort(int[] list){
        //initialising temporary variable
        int temp;

        for(int i = 0; i < list.length - 1; i++){
            //initialise swap to false
            boolean swap = false;

            //start inner loop
            for(int j = 0; j < list.length - 1; j++){
                //if item at current is greater than item at next index swap
                if(list[j] < list[j + 1]){
                    temp = list[j];
                    list[j] = list[j + 1];
                    list[j+1] = temp;

                    //set swapped to true
                    swap = true;
                }
            }

            /**
             * If no number was swapped that means
             * array is sorted now, break the loop
             */
            if(!swap){
                break;
            }

        }

        return list;
    }

    public static void printList(int @NotNull [] list){
        for(int i = list.length - 1; i > -1; i--){
            System.out.print(list[i] + " ");
        }
    }

    public static void main(String[] args){
        int[] list = {14,33,27,35,10};

        BubbleSort example = new BubbleSort();
        list = example.bubbleSort(list);
        example.printList(list);
    }
}
