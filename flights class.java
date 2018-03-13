/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dar_1705228_p2_.fcit.__scheduler;



/**
 *
 * @author Jumana
 */
public  class Flight {
    //Variable declaration
private String flightCode, cityFrom ,cityTo;
private int totalSeats,remSeats;
static int  indexFlight;
private double price;

//No arg Flight constructor
Flight(){
flightCode=null;
cityFrom=null;
cityTo=null;
remSeats=0;
price=0.0;
totalSeats=0;
}
//Full arg Flight constructor
Flight(String flightCode, String cityFrom, String cityTo, int totalSeats, int remSeats, double Price){
this.flightCode =  flightCode;
this.cityFrom=cityFrom;
this.cityTo=cityTo;
this.remSeats=remSeats;
this.price=price;
 this.totalSeats=totalSeats;
}

public static int getindexFlight(){
return indexFlight;
}
public static void incindexFlight(){
indexFlight++;
}

public String getFlightCode(){
return flightCode;
}
public void setFlightCode(String flightCode){
  this.flightCode =  flightCode;
}

public String getCityFrom(){
    return cityFrom;
}
public void setCityFrom(String cityFrom){
this.cityFrom=cityFrom;
}

public String getCityTo(){
    return cityTo;
}
public void setCityTo(String cityTo){
this.cityTo=cityTo;
}

public int getRemSeats(){
    return remSeats;
}
 public void setRemSeats(int remSeats){
 this.remSeats=remSeats;

 }

 public int getTotalSeats(){
    return totalSeats;
}
 public void setTotalSeats(int totalSeats){
 this.totalSeats=totalSeats;

 }

public double getPrice(){
    return price;
}
public void setPrice(double price){
this.price=price;
}



}
