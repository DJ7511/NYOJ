#include <iostream>
using namespace std;

void sort1(char a, char b, char c)  //���������ַ������ַ���ASCII���С�����˳������������ַ�
{
  char t1 = a;  //�ֱ�������char�������ڼ�¼�βδ���������ֵ
  char t2 = b;
  char t3 = c;
  char t; //��ʱ����
  //�������֣���������� 
  if (t1 > t2)  //�����һ�������ڵڶ�������������һ�����͵ڶ����� 
  {
    t = t1; //����t1��t2 
    t1 = t2;
    t2 = t;
  }
  
  //��ʱ��һ����һ���ȵڶ�����С 
  if(t3 < t1) //������������t1С 
    cout << t3 << " " << t1 << " " << t2 << endl; 
  else if(t3 > t2) //������������t2�� 
    cout << t1 << " " << t2 << " " << t3 << endl;
  else //������������t1��t2֮�� 
    cout << t1 << " " << t3 << " " << t2 << endl;
    
} 

int main()  //������� 
{
  int a;  //��¼ѭ������ 
  
  cin >> a;
  for (int n=a; n>=1; n--) 
  {
    char a,b,c;
    cin >> a >> b >> c;
    sort1(a, b, c);
  }
  
  return 0;
}
