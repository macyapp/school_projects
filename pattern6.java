class pattern6
{
    public static void main(String[] args)
    {
        int n,i,j,c,k;
        n=1;
        c=n-1;
        for(i=5;i>=1;i--,c++)
        {
            for(k=1;k<=c;k++)
            {
                System.out.print("  ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}