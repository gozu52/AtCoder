#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int main(){
    int a,b;cin>>a>>b;
    bool f1=false,f2=false,f3=false;
    if(a==7||b==7){
        f1 =true;
        f2 =true;
        f3 =true;
    }
    if(a==6||b==6){
        f2 = true;
        f3 = true;
    }
    if(a==5||b==5){
        f1 = true;
        f3 = true;
    }
    if(a==4||b==4)f3 = true;
    if(a==3||b==3){
        f1 = true;
        f2 = true;
    }
    if(a==2||b==2)f2 = true;
    if(a==1||b==1)f1 = true;
    
    ll ans = 0;
    if(f1)ans+=1;
    if(f2)ans+=2;
    if(f3)ans+=4;
    cout<<ans<<endl;
}