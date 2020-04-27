#include<iostream>
using namespace std;
int main()
{
  int w,x,y,a,b,c,d,r=100;
  std::cin>>w>>x>>y;
  a=w*x;
  b=w*y;
  c=a-b;
  d=c-r;
  std::cout<<d;
}