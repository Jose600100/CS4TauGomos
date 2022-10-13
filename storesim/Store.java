/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package storesim;
import java.util.ArrayList;
/**
 *
 * @author alfon
 */
public class Store {
  private String name;
  private double earnings;
  private ArrayList<Item> itemList;
  private static ArrayList<Store> storeList = new ArrayList();

  public Store(String name){
    // Initialize name to parameter and earnings to zero
    // Initialize itemList as a new ArrayList
    // add 'this' store to storeList
    
    this.name = name;
    earnings = 0;
    itemList = new ArrayList();
    storeList.add(this);
  }

  public String getName(){
    return name;
  }
  public double getEarnings(){
    return earnings;
  }
  public void sellItem(int index){
    // check if index is within the size of the itemList (if not, print statement that there are only x items in the store)
    // get Item at index from itemList and add its cost to earnings
    // print statement indicating the sale
    if (index >= 0 && index <= this.itemList.size()) {
        this.earnings += this.itemList.get(index).getCost();
        System.out.println("Item Sold!");
    }
    else {
        System.out.println("there are only " +this.itemList.size()+ " items in the store!");
    }
  }
  public void sellItem(String name){
    // check if Item with given name is in the itemList (you will need to loop over itemList) (if not, print statement that the store doesn't sell it)
    // get Item from itemList and add its cost to earnings
    // print statement indicating the sale
    boolean Itemsell = false;
    for(int i = 0; i < this.itemList.size(); i++){
        
        if(name.equals(this.itemList.get(i).getName())){
            this.earnings += this.itemList.get(i).getCost();
            System.out.println("Item Sold!");
            Itemsell = true;
        }   
    }
    if (Itemsell == false)
    System.out.println("the store doesn't sell your item!");
  }
  public void sellItem(Item i){
    // check if Item i exists in the store (there is a method that can help with this) (if not, print statement that the store doesn't sell it)
    // get Item i from itemList and add its cost to earnings
    // print statement indicating the sale
    this.itemList.size();
        
    if(itemList.indexOf(i) >= 0) {
        this.earnings += i.getCost();
        System.out.println("Item Sold!");
    } else { 
        System.out.println("the store doesn't sell your item!");
    }
  }
  public void addItem(Item i){
    // add Item i to store's itemList
    itemList.add(i);
  }
  public void filterType(String type){
    // loop over itemList and print all items with the specified type
    for(int i=0; i < this.itemList.size(); i++){
        if(type.equals(this.itemList.get(i).getType())){
            System.out.println(this.itemList.get(i).getName());
        }
    }
  }
  public void filterCheap(double maxCost){
    // loop over itemList and print all items with a cost lower than or equal to the specified value
    for(int i=0; i < this.itemList.size(); i++){
        if(maxCost >= this.itemList.get(i).getCost()){
            System.out.println(this.itemList.get(i).getName());
        }
    }
  }
  public void filterExpensive(double minCost){
    // loop over itemList and print all items with a cost higher than or equal to the specified value
    for(int i=0; i < this.itemList.size(); i++){
        if(minCost <= this.itemList.get(i).getCost()){
            System.out.println(this.itemList.get(i).getName());
        }
    }
  }
  public static void printStats(){
    // loop over storeList and print the name and the earnings'Store.java'
    for(int i=0; i < storeList.size(); i++){
        System.out.println(storeList.get(i).getName() +" "+ storeList.get(i).getEarnings());
    }
  }
}

