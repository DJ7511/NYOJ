#include <iostream>
#include<algorithm>
using namespace std;

int main()
{
  int N, num, num1, num2;
  int count =0;
  int a[4];
  
  cin >> N;
  while(N--)
  {
    count=0;
    cin >> num;
    do
    {
      for(int i=0; i<4; i++)
      {
        a[i]=num%10;
        num=num/10;
      }
      sort(a,a+4);
      num1 = a[0] + a[1]*10 + a[2]*100 + a[3]*1000;
    	num2 = a[0]*1000 + a[1]*100 + a[2]*10 + a[3]; 		
    	num = num1 - num2;    	
      count ++;
    }while(num!=6174);
    cout << count+1 << endl;
  }
  return 0;
}
