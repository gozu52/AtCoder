#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

char s[10];

int main(){
    cin>>s;
    int pos[7] = {};
    for(int i=0;i<10;i++){
        if(i==6&&s[i]=='1')pos[0]++;
        if(i==3&&s[i]=='1')pos[1]++;
        if((i==1||i==7)&&s[i]=='1')pos[2]++;
        if((i==0||i==4)&&s[i]=='1')pos[3]++;
        if((i==2||i==8)&&s[i]=='1')pos[4]++;
        if(i==5&&s[i]=='1')pos[5]++;
        if(i==9&&s[i]=='1')pos[6]++;
    }
    bool f = false;
    string val = "";
    for(int i=0;i<7;i++){
        if(pos[i]>0)val+="1";
        else val += "0";
    }
    if(val.at(0)=='0'&&val.at(6)=='0'){
        for(int i=1;i<=5;i++)if(val.at(i)=='1'){
            if(val.at(i+1)=='0')for(int j=i+2;j<=5;j++)if(val.at(j)=='1')f = true;
        }
    }else if(val.at(0)=='0'&&val.at(6)=='1'){
        for(int i=1;i<=5;i++)if(val.at(i)=='1'){
            for(int j=i+1;j<=5;j++)if(val.at(j)=='0')f = true;
        }
    }else if(val.at(0)=='1'&&val.at(6)=='0'){
        for(int i=1;i<=5;i++)if(val.at(i)=='0'){
            for(int j=i+1;j<=5;j++)if(val.at(j)=='1')f = true;
        }
    }else{
        int cnt = 0;
        for(int i=1;i<=5;i++)if(val.at(i)=='1')cnt++;
        if(cnt!=5)f = true;
    }
    if(s[0]=='1')f = false;
    cout<<(f?"Yes":"No")<<endl;
}