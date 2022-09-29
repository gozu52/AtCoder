#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int main(){
    int x,y,z;cin>>x>>y>>z;
    ll ans = 0;
    if(x>0){
        if(y<x && y>0){
            if(z<y){
                if(z<0){
                    ans = x+2*abs(z);
                }else{
                    ans = x;
                }
            }else{
                ans = -1;
            }
        }else{
            ans = x;
        }
    }else if(x<0){
        if(y>x&&y<0){
            if(z>y){
                if(z>0){
                    ans = abs(x)+2*z;
                }else{
                    ans = abs(x);
                }
            }else{
                ans = -1;
            }
        }else{
            ans = abs(x);
        }
    }
    cout<<ans<<endl;
}