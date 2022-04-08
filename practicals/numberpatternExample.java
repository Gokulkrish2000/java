class numberpatternExample{
public  void npattern(int num)
{
for(int  i=1;i<num;i++)
{
for(int j=1;j<=i;j++)
{
System.out.print(j +"  ");
}
System.out.println();
}
}
public static void main(String args[])
{
numberpatternExample  p = new numberpatternExample();
int num=6;
p. npattern(num);
} 
}