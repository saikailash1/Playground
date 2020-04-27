#include<iostream>
using namespace std;
int main()
{
  int a,b;
  std::cin>>a;
  b=(a%2==0)?1:0;
  if(b==1)
  {
    std::cout<<"Even";
  }
  else
  {
    std::cout<<"Odd";
  }
  return 0;
}