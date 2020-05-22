/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pigmyapp1;

/**
 *
 * @author Venktesh Mutalik
 */
public class bankAgent {
    
        int agentid;
    String name;
    String mobile;
    int balance;
    String password;
    
    bankAgent(int agentid,String name,String mobile,String password){
    this.agentid=agentid;
     this.name=name;
      this.mobile=mobile;
       this.password=password;
       
       
       this.balance=0;
    
    }

    
    void collect(){}
    void deposit(){}
    void createReport(){}
    
    
}
