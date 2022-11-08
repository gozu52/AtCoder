#include <bits/stdc++.h>
#define ll = long long
using namespace std;

string s;

int main(){
    cin>>s;
    for(int i=s.size()-1;i>=0;i--){
        if(s[i]=='a'){
            cout<<i+1<<endl;
            return 0;
        }
    }
    cout<<-1<<endl;
    return 0;
}