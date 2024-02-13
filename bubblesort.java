package dsa;
 class bubblesort {
        void bubblesort(int a[])
    {
        int n = a.length;
        for(int i=0;i<n-1;i++)
        for(int j=0;j<n-1-1;j++)
        if((a[j]>a[j+1]))
        {
        int temp = a[j];
        a[j]= a[j+1];
        a[j+1] = temp;
        }
    }

void arrayprt(int a[])
{
    int n = a.length;
    for(int i=0; i<n;i++)
    System.out.print(a[i] + " ");
    System.out.println(); 

}

public static void main(String[] args) {
    bubblesort ob = new bubblesort();
    int a[]= {2,5,65,43,6,8,76};
    ob.bubblesort(a);
    System.out.println("Sorted Array");
    ob.arrayprt(a);
    
}
}
