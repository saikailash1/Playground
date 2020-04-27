#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int units,amt;
  std::cin>>units;
  if(units<=200)
  {
    amt=units*0.5;
    std::cout<<"Rs."<<amt;
  }
  else if(units>200&&units<=400)
  {
    amt=(units*0.65)+100;
    std::cout<<"Rs."<<amt;
  }
  else if(units>400&&units<=600)
  {
    amt=(units*0.80)+200;
    std::cout<<"Rs."<<amt;
  }
  else if(units>600)
  {
    amt=(units*1.25)+425;
    std::cout<<"Rs."<<amt;
  }
  return 0;
}