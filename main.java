/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dar_1705228_p2_.fcit.__scheduler;
import java.util.*;
import java.io.*;
import java.nio.file.*;
import java.lang.*;
import java.nio.charset.*;


public class DAR_1705228_P2_FCIT__Scheduler {
//flight adding method
    public static   File inputFlight = new File("Input_Flight.txt");
     public static int flightSize,passengerSize,numOfReservations;
      public static Flight[]  flights= new Flight[flightSize];
         public static  File outputFile = new File("OutPut.txt");
          public static  String[] array; public static String line;
      public static Passenger[] passenger = new Passenger[passengerSize];
    public static    Reservation[] reservation =  new Reservation[numOfReservations];

                     public static Flight addFlight(String[] array,int index){

                 flights[index] =new Flight(array[1], array[2],array[3], Integer.parseInt(array[4]),Integer.parseInt(array[5]), Double.parseDouble(array[6]));

                  return flights[index];
                     }


     public static int findSpecifiedLine(int index,File inputFile) throws Exception{
//finds the specified line (of numbers)to be used for array sizes and then converts them to integers to be used for course array sizes
String line =Files.readAllLines(inputFile.toPath(), StandardCharsets.UTF_8).get(0);
String[] splitted = line.split("\\s+");

return Integer.parseInt(splitted[index]);
     }


    public static void main(String[] args)throws Exception {

        File inputFlight = new File("Input_Flight.txt");
        File outputFile = new File("OutPut.txt");
        Scanner input = new Scanner(inputFlight);
        PrintWriter output = new PrintWriter(outputFile);
        flightSize=findSpecifiedLine(0,inputFlight);
        passengerSize=findSpecifiedLine(1,inputFlight);
        numOfReservations=findSpecifiedLine(2,inputFlight);
        flights= new Flight[flightSize];
        passenger = new Passenger[passengerSize];
        reservation =  new Reservation[numOfReservations];

                        //Check for the file's existence
                if (!(inputFlight.exists())){
            System.out.println("The file doesn't exist");
            System.exit(0);
        }
          while(input.hasNext()){
              String line="";
              line = input.nextLine();


              array=line.split("\\s+");

                 if((array[0].equalsIgnoreCase("Add_Flight"))){

                     if(((Flight.getindexFlight()<flightSize))){
                     for(int j=0;j<flights.length;j++){
                      flights[j] =new Flight(array[1], array[2],array[3], Integer.parseInt(array[4]),Integer.parseInt(array[5]), Double.parseDouble(array[6]));
                     }
                      Flight.incindexFlight();
                     }
                     else{
                              System.out.println(" can't add flight");
                              continue;
                             }
                        System.out.print(flights[1].getPrice());

                 }

                 else  if((array[0].equalsIgnoreCase("Add_Passenger"))){

                     if(((Passenger.getindexPassenger()<passengerSize))){
                     for(int j=0;j<passenger.length;j++){
                      passenger[j] =new Passenger(array[1], Integer.parseInt(array[2]),array[3].charAt(0),array[4]);
                     }
                      Passenger.incindexPassenger();

                     }
                     else{
                              System.out.println(" can't add passenger");
                              break;
                             }

 System.out.print(passenger[1].getGender());

          }
                else if((array[0].equalsIgnoreCase("Make_Booking"))){





          }

                     else if((array[0].equalsIgnoreCase("Search_Print"))){





          }
                     else if((array[0].equalsIgnoreCase("Flight_Status"))){



              System.exit(0);

          }

          }

        input.close();
        output.close();
    }

}
