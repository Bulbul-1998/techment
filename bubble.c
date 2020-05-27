#incluse<stdio.h>
void main()
{
int array1[100],num;
printf("enter  he number of elements");
scanf("%d",&num);
printf("Enter the elements of array");
for(i=0;i<num;i++)
{
 scanf("%d",&array[i]);
}
for(j=0;j<num;j++)
{
 for(k=o;k<num-j-1;k++)
 {
  if(array[k]>array[k+1])
{
temp=array[k];
array[k]=array[k+1];
array[k+1]=temp;
}
}
}
printf("sorted elements are");
for(z=0;z<num;z++)
{
 printf(array[]);
}
}