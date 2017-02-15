#include <iostream>
using namespace std;

int main()
{
  int N, x, y, count;
  
  cin >> N;
  x = 0;
  y = N-1;
  count = 1;
  
  int num[N][N];
  
  for (int x=0; x<N; x++) {
		for (int y=0; y<N; y++) {
			num[x][y] = 0;
		} 
  }
  
  num[x][y] = 1;
  
  while(count < N*N) {
		while(x<N-1 && num[x+1][y]==0)
			num[++x][y] = ++count;
		
		while(y>0 && num[x][y-1]==0)
			num[x][--y] = ++count;
	
		while(x>0 && num[x-1][y]==0)
			num[--x][y] = ++count;
		
		while(y<N-1 && num[x][y+1]==0)
			num[x][++y] = ++count;
  }
  
  for (int x=0; x<N; x++) {
		for (int y=0; y<N; y++) {
			cout << num[x][y] << " ";
		}
		cout << endl;
  }
  
  return 0;
}
