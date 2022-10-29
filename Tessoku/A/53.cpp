#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int q,query,x;
priority_queue< int, vector<int>, greater<int> > que;

int main() {
    cin>>q;
    while(q-->0){
        cin>>query;
        if(query==1){
            cin>>x;que.push(x);
        }
        if(query==2)cout<<que.top()<<endl;
        if(query==3)que.pop();
    }
}