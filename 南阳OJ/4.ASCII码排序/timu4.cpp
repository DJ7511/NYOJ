#include <iostream>
using namespace std;

void sort1(char a, char b, char c)  //输入三个字符，按字符的ASCII码从小到大的顺序输出这三个字符
{
  char t1 = a;  //分别定义三个char变量用于记录形参传来的三个值
  char t2 = b;
  char t3 = c;
  char t; //临时变量
  //三个数字，按增序输出 
  if (t1 > t2)  //如果第一个数大于第二个数，交换第一个数和第二个数 
  {
    t = t1; //交换t1和t2 
    t1 = t2;
    t2 = t;
  }
  
  //此时第一个数一定比第二个数小 
  if(t3 < t1) //若第三个数比t1小 
    cout << t3 << " " << t1 << " " << t2 << endl; 
  else if(t3 > t2) //若第三个数比t2大 
    cout << t1 << " " << t2 << " " << t3 << endl;
  else //第三个数介于t1和t2之间 
    cout << t1 << " " << t3 << " " << t2 << endl;
    
} 

int main()  //程序入口 
{
  int a;  //记录循环次数 
  
  cin >> a;
  for (int n=a; n>=1; n--) 
  {
    char a,b,c;
    cin >> a >> b >> c;
    sort1(a, b, c);
  }
  
  return 0;
}
