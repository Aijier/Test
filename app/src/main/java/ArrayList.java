/**
 * Created by aijie on 16/3/25.
 */
public class ArrayList {

        public static void main(String[] args) {
            int [] arr={22,34,18,46,20};
            System.out.print("数组排序");
            arrayList(arr);
            selectSortUp(arr);
            arrayList(arr);
            selectSortDown(arr);
            arrayList(arr);
            bubbleSortUp(arr);
            arrayList(arr);
            bubbleSortDown(arr);
            arrayList(arr);
        }
        public static void arrayList(int [] arr){
            for(int i=0;i<arr.length;i++){
                if(i!=arr.length-1){
                    System.out.print(arr[i]+",");
                }else{
                    System.out.println(arr[i]);
                }
            }
        }
        public static void selectSortUp(int [] arr){
            for(int i=0;i<arr.length-1;i++){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[i]>arr[j]){
                        int temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
            }
        }
        public static void selectSortDown(int [] arr){
            for(int i=0;i<arr.length-1;i++){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[i]<arr[j]){
                        int temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
            }
        }
        public static void bubbleSortUp(int [] arr){
            for(int i=0;i<arr.length-1;i++){
                for(int j=0;j<arr.length-1-i;j++){
                    if(arr[j]>arr[j+1]){
                        int temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                    }
                }
            }
        }
        public static void bubbleSortDown(int [] arr){
            for(int i=0;i<arr.length-1;i++){
                for(int j=0;j<arr.length-1-i;j++){
                    if(arr[j]<arr[j+1]){
                        int temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                    }
                }
            }
        }



}


