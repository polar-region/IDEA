public class TestProject {
    //使用模板
    public static void main(String[] args) {

        int[] arr = {12, 4, 6, 7, 90};
        MyTools tool = new MyTools();
        tool.Bubble(arr);
        System.out.println("---排序后---");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

class MyTools {

    void Bubble(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}