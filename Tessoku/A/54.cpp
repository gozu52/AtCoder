#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int q,query,y;
string x;
map<string,int> mp;

int main() {
    cin>>q;
    while(q-->0){
        cin>>query;
        if(query==1){
            cin>>x>>y;
            mp[x]=y;
        }else{
            cin>>x;
            cout<<mp[x]<<endl;
        }
    }
}