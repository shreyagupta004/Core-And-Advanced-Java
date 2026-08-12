import java.util.*;

public class lec_61_arrayList {
    private static Scanner scanner = new Scanner(System.in);
    public static shoppingCart shopCart = new shoppingCart();

    public static void main(String[] args) {

        boolean exit = false;
        int userChoice = 0;
        printInstruction();
        

        while(!exit){
            System.out.println("Enter your choice: ");
            userChoice = scanner.nextInt();
            scanner.nextLine();

            switch(userChoice){
                case 0 :
                    printInstruction();
                    break;
                case 1 :
                    shopCart.printList();
                    break;
                case 2 :
                    addItem();
                    break;
                case 3 :
                    modifyItem();
                    break;
                case 4 :
                    removeItem();
                    break;
                case 5 :
                    searchItem();
                    break;
                case 6 :
                    exit = true;
                    break;
            }
        }
    }    

        public static void printInstruction(){
            System.out.println("press");
            System.out.println("0 - to print choices:");
            System.out.println("1 - to print grocery list");
            System.out.println("2 - to add items");
            System.out.println("3 - to modify an item");
            System.out.println("4 - to remove an items ");
            System.out.println("5 - to search an items ");
            System.out.println("6 - to exit");
        }

        public static void addItem(){
            System.out.print("enter your shopping items:");
            shopCart.addItem(scanner.nextLine());
        }

        public static void modifyItem(){
            System.out.print("enter the item number:");
            int itemNo = scanner.nextInt();
            scanner.nextLine();
            System.out.print("enter the replacement:");
            String newItem = scanner.nextLine();
            shopCart.modifyItem(itemNo - 1, newItem);
        }
         
        public static void removeItem(){
            System.out.print("insert item to search:");
            int itemNo = scanner.nextInt();
            scanner.nextLine();
            shopCart.removeItem(itemNo - 1);
        }
        public static void searchItem(){
            System.out.print("insert item you want to search");
            String searchIt = scanner.nextLine();
            String result = shopCart.searchItem(searchIt);

            if(result != null){
                System.out.println("item found");
            }else{
                System.out.println("item not found");
            }
        }
       
    
    public static class  shoppingCart{
        
         ArrayList<String> shoppingCart = new ArrayList<>();

         public void addItem(String item){
            shoppingCart.add(item);
         }

         public void printList(){
            System.out.println("there are " + shoppingCart.size() + " items in your cart." );
            for(int i = 0 ; i < shoppingCart.size() ; i++){
                System.out.println("the items " + (i + 1) +" is " + shoppingCart.get(i));
            }
         }
            public void modifyItem(int position , String newItem){
                shoppingCart.set(position, newItem);
                System.out.println("the shopping items " + (position + 1) + " are modified");
            }

            public void removeItem(int position){
                String itemName = shoppingCart.get(position);
                shoppingCart.remove(position);

            }

            public String searchItem(String searchItem){
                int position = shoppingCart.indexOf(searchItem);
                if(position >= 0){
                    return shoppingCart.get(position);
                }else{
                    return null;
                }
            }
    }
}
    
