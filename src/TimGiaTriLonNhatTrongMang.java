import java.util.Scanner;

public class TimGiaTriLonNhatTrongMang {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner=new Scanner(System.in);
        do
    {
        System.out.print("Nhap kich co mang ");
        size=scanner.nextInt();
        if(size>20)
        {
            System.out.println("Kich co vuot qua cho phep");
        }
    }
        while (size>20);
        array=new int[size];
        int i=0;
        while (i<array.length)
        {
            System.out.println("Enter element" + (i + 1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }
System.out.println("Hien thi danh sach");
        i=0;
        while (i<array.length)
        {
            System.out.println("Mang = "+array[i]+" o vi tri "+(i+1));
            i++;
        }
        int max=array[0];
        for(int j=0;j<array.length;j++)
        {
            if(max<array[j])
            {
                max=array[j];
            }
        }
        System.out.print("Max = "+max);
    }
}
