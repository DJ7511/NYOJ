#include<iostream> 
using namespace std;

bool isPrime(int x)
{
  if(x==1)
    return false;
    
  for(int i=2; i<x; i++)
    if(x%i==0)
      return false;
      
  return true;
}

int main()
{
  int line, base, sum;
  
  cin >> line;
  
  while(line--)
  {
    sum = 0;
    cin >> base;
    int s[base];
    for(int i=0; i<base; i++)
      cin >> s[i];
      
    for(int i=0; i<base; i++)
      if(isPrime(s[i]))
        sum += s[i];
        
    cout << sum << endl;
  }
  return 0;
}
