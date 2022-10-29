#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int q,query;
string x;
deque<string> que;

int main() {
    cin>>q;
    while(q-->0){
        cin>>query;
        if(query==1){
            cin>>x;
            que.push_front(x);
        }
        if(query==2)cout<<que.front()<<endl;
        if(query==3)que.pop_front();
    }
}