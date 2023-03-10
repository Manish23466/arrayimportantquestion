//Span of an array
//Span=max-min
public class span {
    public static void main(String[] args) {
        int arr[]={3,1,6,8,3};
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        //System.out.println(max+" "+min);
        int span=max-min;
        System.out.println(span);
    }
}
