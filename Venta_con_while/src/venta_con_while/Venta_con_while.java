package venta_con_while;
import java.util.Scanner;
public class Venta_con_while {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        double precio,cant,precio_con_IVA; 
	String producto,Tipo_Producto,Salir;
	Salir = " ";
while(  !"No".equals(Salir) && !"no".equals(Salir) && !"NO".equals(Salir)){
	System.out.println("Teclea Producto: ");producto = S.next();
	System.out.println("Teclea Cantidad: ");cant = S.nextDouble(); 
	System.out.println("Teclea Precio: ");precio = S.nextDouble();
	System.out.println("¿Qué tipo de producto es? (D/A/M)");Tipo_Producto = S.next();
	
	if ("D".equals(Tipo_Producto) || "d".equals(Tipo_Producto)) {
		precio_con_IVA = precio + (precio * 0.16) * cant;
        }
        else{
		precio_con_IVA = precio * cant;
        }
	System.out.println(" ");
	System.out.println("SU PEDIDO ES: "+producto);
	System.out.println("LA CANTIDAD DE PRODUCTOS ES: "+cant);
	System.out.println("EL TOTAL A PAGAR ES: "+precio_con_IVA);
	System.out.println(" ");
	System.out.println("¿Quiere hacer otro pedido?");
        System.out.println("Si no deseas salir simplemente escribe No.");
	Salir=S.next();
    }
	System.out.println(" ");
	System.out.println("Gracias por su compra, vuelva pronto.");
    }
}