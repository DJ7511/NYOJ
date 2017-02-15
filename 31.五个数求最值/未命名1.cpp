#include<iostream>
using namespace std;

int main()
{
  int num, max, min;
  cin >> num;
  max = min = num;
  
  for(int i=0; i<4; i++)
  {
    cin >> num;
    
     if (num > max)
     {
        max = num;
        continue;
      }

      if(num < min)
      {
        min = num;
        continue;
      }
  }
  
  cout << min << " " << max;
  return 0;
}
