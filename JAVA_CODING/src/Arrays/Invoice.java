package Arrays;

import java.util.Scanner;

class Invoice {
    String invoiceId;
    float invoicePrice;
    String vendorName;
    String invoiceName;
    String location;
    
    //Default constructor

    public Invoice() { }
    
    //read data from user

    public void addInvoice() {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter invoice ID: ");
        invoiceId = obj.nextLine();
        System.out.print("Enter invoice price: ");
        invoicePrice = obj.nextFloat();
        obj.nextLine();      
        System.out.print("Enter vendor name: ");
        vendorName = obj.nextLine();
        System.out.print("Enter invoice name: ");
       invoiceName = obj.nextLine();
        System.out.print("Enter location: ");
        location = obj.nextLine();
    }
       //Display all data members
    public void displayInvoice() {
        System.out.println("Invoice ID: " + invoiceId);
        System.out.println("Invoice Price: " + invoicePrice);
        System.out.println("Vendor Name: " + vendorName);
        System.out.println("Invoice Name: " +invoiceName);
        System.out.println("Location: " + location);
    }



    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the number of invoices: ");
        int n = obj.nextInt();
        obj.nextLine(); 

        Invoice[] invoices = new Invoice[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Invoice " + (i + 1) + ":");
            invoices[i] = new Invoice();
            invoices[i].addInvoice();
        }

        System.out.println("\nInvoice Details:");
        for (int i = 0; i < n; i++) {
            System.out.println("\nInvoice " + (i + 1) + " details:");
            invoices[i].displayInvoice();
        }
    }
}

