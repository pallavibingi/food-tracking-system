import java.util.Scanner;


public class FoodTrackingSystem {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Customer Name:");
        String name=sc.nextLine();

        System.out.println("Hello "+name+"!, here is your menu:");

        //menu items and their prices

        String[] items ={"Chicken Briyani","Palak Paneer","Gobi Manchurian","Pizza","Egg Noodles"};
        int[] price = {240,150,120,90,70};

        boolean ordering=true;
        int totalbill=0;
        String result="";
        //Order the items
        while(ordering){

//display the menu:

            System.out.println("---------------MENU----------------");
            for(int i=0;i<items.length;i++){
                System.out.println((i+1)+" : "+items[i]+" - "+price[i]);
            }
            System.out.println("------------------------------------");

        
//select from any one the menu:
            System.out.print("\nEnter the item number(choice): \n");
            int choice=sc.nextInt();
             System.out.println("You Order "+items[choice-1]+", The Price is "+price[choice-1]);

//itemprice calculation as per how many quantities:
            System.out.print("Enter the quantity: \n");
            int quantity=sc.nextInt();

           int itemprice=price[choice-1]*quantity;
           System.out.println("The Item Price is "+itemprice);

//caluculating the total bill
            totalbill += itemprice; 
            result+=items[choice-1]+",";

            System.out.println("Do you want to order more (say : Yes/No) : ");
            sc.nextLine();  //to clear the leftover space
            String more=sc.nextLine();

            if(more.equals("No")){
                ordering = false;
            }
        }
                System.out.println("\n-----------------BILL--------------\n");
                System.out.println("The Items You ordered : "+result);
                System.out.println("Total Bill = "+totalbill);
                System.out.println("\n-------------------------------------");


    }
    
}
