#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int q,query;
deque<string> dq;
string x;

int main() {
    cin>>q;
    while(q-->0){
        cin>>query;
        if(query==1){
            cin>>x;
            dq.push_back(x);
        }
        if(query==2)cout<<dq.front()<<endl;
        if(query==3)dq.pop_front();
    }
}