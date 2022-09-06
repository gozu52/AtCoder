#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

char s[10];

int main(){
    cin>>s;
    int ans = 0;
    if(s[0]=='M'){
        ans = 5;
    }else if(s[0]=='W'){
        ans = 3;
    }else if(s[0]=='F'){
        ans = 1;
    }else{
        if(s[1]=='u')ans = 4;
        if(s[1]=='h')ans = 2;
    }
    cout<<ans<<endl;
}