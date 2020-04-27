#include<iostream>
int bacteria(int,int,int);
int main()
{
  int a,b,c;
  std::cin>>a>>b>>c;
  bacteria(a,b,c);
  return 0;
}
int bacteria(int x,int y,int z)
{
  int i=1,val=1;
  while(i<=y)
  {
    val=val*x;
    i++;
  }
  if(val>=z)
  {
    std::cout<<"Doctor, you can proceed with your experiment.";
  }
  else
  {
    std::cout<<"Sorry Doctor! You need more bacteria.";
  }
}
  