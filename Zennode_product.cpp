#include<bits/stdc++.h>
using namespace std;
int main(){
    int quantity_a,quantity_b,quantity_c;
    char wrap_a,wrap_b,wrap_c;
    cout<<"Please enter the quantity of Product A : ";
    cin>>quantity_a;
    cout<<"Product A has to wrap (Y/N) : ";
    cin>>wrap_a;
    cout<<"Please enter the quantity of Product B : ";
    cin>>quantity_b;
    cout<<"Product A has to wrap (Y/N) : ";
    cin>>wrap_b;
    cout<<"Please enter the quantity of Product C : ";
    cin>>quantity_c;
    cout<<"Product A has to wrap (Y/N) : ";
    cin>>wrap_c;
    int total_value=(quantity_a*20)+(quantity_b*40)+(quantity_c*50);
    int total_quantity=quantity_a+quantity_b+quantity_c;
    float discount4=0,discount3=0,discount2=0,discount1=0;
    if(total_quantity>=30){
        if(quantity_a>=15){
            discount1+=float(quantity_a-15)*0.5*20;
        }
        if(quantity_b>=15){
            discount1+=float(quantity_a-15)*0.5*40;
        }
        if(quantity_c>=15){
            discount1+=float(quantity_a-15)*0.5*50;
        }
    }
    if(total_quantity>=20){
        discount2=float(total_value*0.1);
    }
     if(quantity_a>=10){
       discount3=float((quantity_a*20)*0.05);
     }
     if(quantity_b>=10){
       discount3+=float((quantity_b*40)*0.05);
     }
     if(quantity_c>=10){
       discount3+=float((quantity_c*50)*0.05);
     }
     if(total_value>=200){
      discount4=float(total_value*0.1);
     }
     int gift_fees=0,shipping_fee=0;
     if(wrap_a=='Y'||wrap_a=='y')gift_fees+=quantity_a;
     if(wrap_b=='Y'||wrap_b=='y')gift_fees+=quantity_b;
     if(wrap_c=='Y'||wrap_c=='y')gift_fees+=quantity_c;
     if(total_quantity%10==0)shipping_fee=(total_quantity/10)*5;
     else shipping_fee=((total_quantity/10)+1)*5;
     float maxdiscount=max(discount1,max(discount2,max(discount3,discount4)));

     cout<<endl<<endl<<"Product Name       Quantity       Total Amount"<<endl;
     cout<<"Product A           "<<quantity_a<<"              "<<quantity_a*20<<endl;
     cout<<"Product B           "<<quantity_b<<"              "<<quantity_b*40<<endl;
     cout<<"Product C           "<<quantity_c<<"              "<<quantity_c*50<<endl;
     cout<<"SubTotal            "<<total_quantity<<"             "<<total_value<<endl;
     if(maxdiscount==discount1)cout<<"Tiered_50_discount apply on it"<<endl;
     else if(maxdiscount==discount2)cout<<"bulk_20_discount apply on it"<<endl;
     else if(maxdiscount==discount3)cout<<"bulk_10_discount apply on it"<<endl;
     else cout<<"flat_10_dicount apply on it"<<endl;
     cout<<"Total Discount : "<<maxdiscount<<endl;
     cout<<"Gift Wrap Fee : "<<gift_fees<<endl;
     cout<<"Shipping Fee : "<<shipping_fee<<endl;
     cout<<"Total Payable : "<<(total_value-maxdiscount)+shipping_fee+gift_fees<<endl;
     
}