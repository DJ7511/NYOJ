#include <iostream> 
using namespace std;

int main()
{
  int a;  //��¼ѭ������
  cin >> a;
  
  while(a>=1)
  {
    int x;
    cin >> x;
    
    for (int n=1; n<=x; n++) {  //�����������
      if (n%2 !=0) {
          cout << n << " ";
      }
    }

    cout << endl; 

    for (int n=1; n<=x; n++) {  //�������ż��
        if (n%2 == 0) {
            cout << n << " ";
        }
    }
    
    a--;
  } 
  
  return 0; 
} 
