package Gestion_inventario;
 
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
 
public class Main {
    public static void main(String[] args) {
        try {
            Connection conn = DatabaseConnection.getConnection();
            ProductDAO productDAO = new ProductDAO(conn);
 
            System.out.println("\n=== AGREGAR PRODUCTO ===");
            Product p = new Product("Laptop", 1200.50, "Tecnologia", "Laptop gaming");
            productDAO.addProduct(p);
            System.out.println("Producto agregado: " + p);
            
            Product m = new Product("mause", 1200.50, "Tecnologia", " gaming");
            productDAO.addProduct(m);
            System.out.println("Producto agregado: " + m);
 
            System.out.println("\n=== OBTENER PRODUCTO POR ID ===");
            Product productObtenido = productDAO.getProductById(p.getId());
            System.out.println("Producto encontrado: " + productObtenido);
 
            System.out.println("\n=== LISTAR TODOS LOS PRODUCTOS ===");
            List<Product> productos = productDAO.getAllProducts();
            productos.forEach(System.out::println);
 
            System.out.println("\n=== ACTUALIZAR PRODUCTO ===");
            p.setPrice(999.99);
            p.setName("Laptop Gaming");
            productDAO.updateProduct(p); 
            System.out.println("Producto actualizado: " + productDAO.getProductById(p.getId()));
 
            System.out.println("\n=== ELIMINAR PRODUCTO ===");
            if (productDAO.deleteProduct(p.getId())) {
                System.out.println("Producto eliminado exitosamente");
            }
 
        } catch (SQLException e) {
            System.out.println("Error en operación SQL");
            e.printStackTrace();
        }
    }
}