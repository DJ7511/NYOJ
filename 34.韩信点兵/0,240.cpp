#include <iostream>
using namespace std;

int main()
{
  int x, y, z, num;
  
  cin >> x >> y >> z;
  
  for (int i=10; i<=100; i++) {
    if ((i-x)%3==0) {
      if ((i-y)%5==0) {
        if ((i-z)%7==0) {
          cout << i;
          break;
        }
      }
    }
    num = i;
  }
  
  if(num == 100) {
    cout << "No answer";
  }
}
