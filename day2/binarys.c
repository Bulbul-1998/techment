#incluse<stdio.h>
void main()
{
 int search,num,i,middle,start=0,end=num-1;
 int array[50];
 printf("enter the number of elements");
 scanf("%d",&num);
 printf("Enter the elements of array in ascending order");
for(i=0;i<num;i++)
{
 scanf("%d",&array[i]);
}
printf("enter the number to search");
scanf("%d",&search);
middle=(start+end)/2
while(start<=end)
{
 if(array[middle]<search)
{
start=middle+1;
elseif(array[middle]==search)
{
printf("%d is present in the array",search)
break;
}
else
end=middle-1;
middle=(start=end)/2;
if(start>end){
print("not present");
}

