package infrastructure;

import model.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ProductRepositoryImpl {

    public boolean insertProduct(Product product) {

        String sql = "INSERT INTO tb_products(id, name, quantity, price, description, category, status, is_delete, delete_at) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (
                Connection conn = DatabaseConnection.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql)
        ) {
            stmt.setInt(1, product.getId());
            stmt.setString(2, product.getName());
            stmt.setDouble(3, product.getQuantity());
            stmt.setInt(4, product.getPrice());
            stmt.setString(5, product.getDescription());
            stmt.setString(6, product.getCategory());
            stmt.setBoolean(7,true);
            stmt.setBoolean(8, false);
            stmt.setDate(9, null);
            
            stmt.executeUpdate();

            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void deleteProduct(int id)
    {
        String sql = "DELETE FROM tb_products WHERE id = ?";

    }
}