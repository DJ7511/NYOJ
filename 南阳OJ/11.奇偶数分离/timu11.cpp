#include <iostream> 
using namespace std;

int main()
{
  int a;  //记录循环次数
  cin >> a;
  
  while(a>=1)
  {
    int x;
    cin >> x;
    
    for (int n=1; n<=x; n++) {  //遍历输出奇数
      if (n%2 !=0) {
          cout << n << " ";
      }
    }

    cout << endl; 

    for (int n=1; n<=x; n++) {  //遍历输出偶数
        if (n%2 == 0) {
            cout << n << " ";
        }
    }
    
    a--;
  } 
  
  return 0; 
} 
