package Modules;

import DBConnect.DoConnection;

import java.sql.Connection;

public class Receiver {
    DoConnection connect =new DoConnection();
    Connection conn=connect.getConnection();
    String name, username, email,contact, address, bloodGroup;
    int id,bloodAmount;
    public Receiver(){

    }
    public Receiver(int id, String name, String username, String email, String contact, String address, String bloodGroup, int bloodAmount){
        this.id=id;
        this.name=name;
        this.username=username;
        this.email=email;
        this.contact=contact;
        this.address=address;
        this.bloodGroup=bloodGroup;
        this.bloodAmount=bloodAmount;
    }
    public void setId(int id){

    }
    public int getId(){
        return id;
    }
    public void setName(String name){

    }
//    public String getName(){
//        return name;
//    }
//    public void setUsername(String username){
//
//    }
//    public String getUsername(){
//        return username;
//    }
}
