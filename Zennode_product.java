import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantity_a, quantity_b, quantity_c;
        char wrap_a, wrap_b, wrap_c;
        System.out.print("Please enter the quantity of Product A : ");
        quantity_a = scanner.nextInt();
        System.out.print("Product A has to wrap (Y/N) : ");
        wrap_a = scanner.next().charAt(0);
        System.out.print("Please enter the quantity of Product B : ");
        quantity_b = scanner.nextInt();
        System.out.print("Product B has to wrap (Y/N) : ");
        wrap_b = scanner.next().charAt(0);
        System.out.print("Please enter the quantity of Product C : ");
        quantity_c = scanner.nextInt();
        System.out.print("Product C has to wrap (Y/N) : ");
        wrap_c = scanner.next().charAt(0);
        int total_value = (quantity_a * 20) + (quantity_b * 40) + (quantity_c * 50);
        int total_quantity = quantity_a + quantity_b + quantity_c;
        float discount4 = 0, discount3 = 0, discount2 = 0, discount1 = 0;
        if (total_quantity >= 30) {
            if (quantity_a >= 15) {
                discount1 += (quantity_a - 15) * 0.5 * 20;
            }
            if (quantity_b >= 15) {
                discount1 += (quantity_b - 15) * 0.5 * 40;
            }
            if (quantity_c >= 15) {
                discount1 += (quantity_c - 15) * 0.5 * 50;
            }
        }
        if (total_quantity >= 20) {
            discount2 = (float)(total_value * 0.1);
        }
        if (quantity_a >= 10) {
            discount3 = (float)((quantity_a * 20) * 0.05);
        }
        if (quantity_b >= 10) {
            discount3 += (float)((quantity_b * 40) * 0.05);
        }
        if (quantity_c >= 10) {
            discount3 += (float)((quantity_c * 50) * 0.05);
        }
        if (total_value >= 200) {
            discount4 = (float)(total_value * 0.1);
        }
        int gift_fees = 0, shipping_fee = 0;
        if (wrap_a == 'Y' || wrap_a == 'y') {
            gift_fees += quantity_a;
        }
        if(wrap_b=='Y'||wrap_b=='y')gift_fees+=quantity_b;
        if(wrap_c=='Y'||wrap_c=='y')gift_fees+=quantity_c;
        if(total_quantity%10==0)shipping_fee=(total_quantity/10)*5;
        else shipping_fee=((total_quantity/10)+1)*5;
        float maxdiscount=Math.max(discount1,Math.max(discount2,Math.max(discount3,discount4)));
        System.out.println("\n\nProduct Name       Quantity       Total Amount");
        System.out.println("Product A           "+quantity_a+"              "+quantity_a*20);
        System.out.println("Product B           "+quantity_b+"              "+quantity_b*40);
        System.out.println("Product C           "+quantity_c+"              "+quantity_c*50);
        System.out.println("SubTotal            "+total_quantity+"             "+total_value);
        if(maxdiscount==discount1)System.out.println("Tiered_50_discount apply on it");
        else if(maxdiscount==discount2)System.out.println("bulk_20_discount apply on it");
        else if(maxdiscount==discount3)System.out.println("bulk_10_discount apply on it");
        else System.out.println("flat_10_dicount apply on it");
        System.out.println("Total Discount : "+maxdiscount);
        System.out.println("Gift Wrap Fee : "+gift_fees);
        System.out.println("Shipping Fee : "+shipping_fee);
        System.out.println("Total Payable : "+((total_value-maxdiscount)+shipping_fee+gift_fees));

    }
}