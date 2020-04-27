#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c,pro;
  std::cin>>a>>b>>c;
  pro=a*b;
  if(pro>c)
  {
    std::cout<<"Can reach";
  }
  else
  {
    std::cout<<"Cannot reach";
  }
  return 0;
}