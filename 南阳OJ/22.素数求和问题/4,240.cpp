#include<stdio.h>
int prime(int n)
{
    int a=2;
    while(n>=a)
        if(!(n%a++))
            break;
    if(a==n+1&&n!=1)
        return 1;
    return 0;
}
int main()
{
    int n,m;
    int a[1024];
    scanf("%d",&n);
    while(n--)
    {
        int sum=0;
        scanf("%d",&m);
        for(int i = 0;i<m;++i)
            scanf("%d",&a[i]);
        for(int i = 0;i<m;++i)
            if(prime(a[i]))
            sum+=a[i];
        printf("%d\n",sum);
    }
   return 0;
}
