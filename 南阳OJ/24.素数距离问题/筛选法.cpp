#include<iostream> 
#define Max 1000010;
using namespace std;

//0表示假，1/非0表真 
int isPrime(int x)
{
  if(x==1)
    return 0;

  for(int i=2; i*i<x; i++)
  {
    if(x%i==0)
      return 0;
  }
  
  return 1;
} 

int main()
{
  int N, num, numUp, numDown;
  cin >> N;
  
  while(N--)
  {
    cin >> num;
    
    if(isPrime(num))
      cout << num << " " << 0 << endl;
    else 
    {
      numUp = numDown = num;
      
      while(!isPrime(numUp))
        numUp ++; 
      
      while(!isPrime(numDown) && numDown>0)
        numDown --;
        
      if(numDown == 0)
        cout << numUp << " " << numUp-num << endl;
      else if((numUp-num)>(num-numDown))
        cout << numDown << " " << num-numDown << endl;
      else if ((numUp-num)==(num-numDown))
        cout << numUp << " " << numUp-num << endl;
      else
        cout << numUp << " " << numUp-num << endl;
    } 
  }
  return 0;
}
