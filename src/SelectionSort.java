import org.jetbrains.annotations.NotNull;

public class SelectionSort {

    public static int[] selectionSort(int[] list){
        int minIndex;

        for(int i = 0; i < list.length; i++){
            //set minIndex to index 0
            minIndex = i;

            //check for minimum element
            for(int j = i + 1; j < list.length - 1; j ++){
                if(list[j] < list[minIndex]){
                    minIndex = j;
                }
            }

            //swap minimum with the current beginning element of the list
            if(minIndex != i){
                int temp = list[minIndex];
                list[minIndex] = list[i];
                list[i] = temp;
            }
        }
        return list;
    }

    public static void printList(int @NotNull [] list){
        for(int i = 0; i <= list.length - 1; i++){
            System.out.print(list[i] + " ");
        }
    }

    public static void main(String[] args){
        int[] list = {14,33,27,10,35,19,42,44};

        SelectionSort example = new SelectionSort();
        list = example.selectionSort(list);
        example.printList(list);
    }
}


