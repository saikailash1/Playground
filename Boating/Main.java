#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c,d;
  std::cin>>a>>b>>c;
  b=b*75;
  c=c*30;
  d=b+c;
  if(d<=a)
  {
    std::cout<<"Boat is stable";
  }
  else
  {
    std::cout<<"Boat will drow";
  }
  return 0;
}