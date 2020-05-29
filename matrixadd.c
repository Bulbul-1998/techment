#include<stdio.h>
void main()
{
 int m,n,c,d,first[10][10],second[10][10],sum[10][10];
printf("enter the number of rows and coloums");
scanf("%d",&m,&n);
printf("eneter the elements of first matrix");
for(c=0;c<m;c++)
{
 for(d=0;c<n;d++)
{
 scanf("%d",&first[c][d]);
}
}
printf("enter the elemens of second matrix")
for(c=0;c<m;c++)
{
 for(d=0;c<n;d++)
{
 scanf("%d",&second[c][d]);
}
}
for(c=0;c<m;c++)
{
 for(d=0;c<n;d++)
{
 sum[c][d]=first[c][d]+second[c][d];
 printf("%d",sum[c][d]);
}
}
}