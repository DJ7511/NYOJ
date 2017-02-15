#include <stdio.h>
main()
{
  int M,N,i,a,s,f;
  scanf("%d",&M);
  while(M--)
  {
    scanf("%d",&N);
    s=0;
      while(N--)
      {
        f=1;
        scanf("%d",&a);
        if(a==1)
          continue;
        for(i=2;i<a;i++)
          if(a%i==0)
          {
            f=0;
            break;
          }
        if(f!=0)
          s+=a;
      }
        printf("%d\n",s);
  }
}
