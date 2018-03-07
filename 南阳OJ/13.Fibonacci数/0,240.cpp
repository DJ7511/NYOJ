#include<iostream> 
using namespace std;

int f(int i)
{
	if (i <= 2 && i >= 0 ) {
		return 1;
	}
	return f(i - 1) + f(i - 2);
}

int main()
{
  int a;
  cin >> a;
  int temp;
  
  for(int i = 0; i < a; i++){	
		cin >> temp;
		cout << f(temp) << endl;
	}
}
