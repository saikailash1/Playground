#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c,d,e,f;
  std::cin>>a;
  b=a/1000;
  c=a%1000;
  d=c%100;
  e=d%10;
  f=b+e;
  std::cout<<f;
}