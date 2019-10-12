// Import modules
import java.util.Scanner;

public class plaCostCalculator{
public static void main(String[] args){
// input electrical cost


// Store doubles
double tax, costPerKG, totalCost, costPerGram, costPerObject, amountOfPLA;


// Scan the keyboard for user input
Scanner input = new Scanner(System.in);


// Ask the user
System.out.println("How much did it cost for 1 KG of PLA? ===>");
costPerKG = input.nextInt();
System.out.println("How many grams of PLA are you using per print? ===>");
amountOfPLA = input.nextInt();


// Calculations 
tax = costPerKG * 0.07;
totalCost = tax + costPerKG;
costPerGram = totalCost / 1000;
costPerObject = costPerGram * amountOfPLA;


// Tell the user
System.out.println("This item cost's $" + costPerObject + " per print.");}}
