/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionnaire.des.etudiants;

/**
 *
 * @author aziz
 */
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DataBase {

    private final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
    private final String DATABASE_URL = "jdbc:mysql://localhost:3306/";
    private final String DATABASE_NAME = "MyFaculty";
    private final String USERNAME = "root";
    private final String PASSWORD = "";

    private final String CREATE_DB_QUERY = "CREATE DATABASE IF NOT EXISTS MyFaculty;";
    private final String Use_DB_QUERY = "use MyFaculty";
    private final String CREATE_TABLE_QUERY = "CREATE TABLE IF NOT EXISTS `notes` (\n"
            + " `id` int(10) NOT NULL AUTO_INCREMENT,\n"
            + " `nom` varchar(200) NOT NULL,\n"
            + " `email` varchar(200) NOT NULL,\n"
            + " `securite` varchar(200) DEFAULT NULL,\n"
            + " `reseau` varchar(200) DEFAULT NULL,\n"
            + " `Java` varchar(200) DEFAULT NULL,\n"
            + " `php` varchar(200) DEFAULT NULL,\n"
            + " `android` varchar(200) DEFAULT NULL,\n"
            + " `sgbd` varchar(200) DEFAULT NULL,\n"
            + " `math` varchar(200) DEFAULT NULL,\n"
            + " `francais` varchar(200) DEFAULT NULL,\n"
            + " `anglais` varchar(200) DEFAULT NULL,\n"
            + " `pfe` varchar(200) DEFAULT NULL,\n"
            + " PRIMARY KEY (`id`),\n"
            + " UNIQUE KEY `email` (`email`)\n"
            + "); ";

    public DataBase() throws ClassNotFoundException, SQLException {
        Class.forName(DRIVER_NAME);
        Connection cn = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
        Statement st = cn.createStatement();
        st.execute(CREATE_DB_QUERY);
        st.execute(Use_DB_QUERY);
        st.execute(CREATE_TABLE_QUERY);
        cn.close();
    }

    public Connection createConnection() throws ClassNotFoundException, SQLException {
        return DriverManager.getConnection(DATABASE_URL + DATABASE_NAME, USERNAME, PASSWORD);
    }

    public void SaveNote(Note n) {
        Connection cn = null;
        try {
            cn = createConnection();
            PreparedStatement pst;
            if (GetNote(n.getEmail()) != null) {
                pst = cn.prepareStatement("UPDATE `notes` SET `nom`=?,`email`=?,`securite`=?,`reseau`=?,`Java`=?,`php`=?,`android`=?,`sgbd`=?,`math`=?,`francais`=?,`anglais`=?,`pfe`=? WHERE email = ?");
                pst.setString(1, n.getFull_name());
                pst.setString(2, n.getEmail());
                pst.setString(3, n.getSecurite());
                pst.setString(4, n.getReseau());
                pst.setString(5, n.getJava());
                pst.setString(6, n.getPhp());
                pst.setString(7, n.getAndroid());
                pst.setString(8, n.getSgbd());
                pst.setString(9, n.getMath());
                pst.setString(10, n.getFrancais());
                pst.setString(11, n.getAnglais());
                pst.setString(12, n.getPfe());
                pst.setString(13, n.getEmail());
            } else {
                pst = cn.prepareStatement("INSERT INTO notes values(null,?,?,?,?,?,?,?,?,?,?,?,?)");
                pst.setString(1, n.getFull_name());
                pst.setString(2, n.getEmail());
                pst.setString(3, n.getSecurite());
                pst.setString(4, n.getReseau());
                pst.setString(5, n.getJava());
                pst.setString(6, n.getPhp());
                pst.setString(7, n.getAndroid());
                pst.setString(8, n.getSgbd());
                pst.setString(9, n.getMath());
                pst.setString(10, n.getFrancais());
                pst.setString(11, n.getAnglais());
                pst.setString(12, n.getPfe());
            }
            pst.executeUpdate();
            cn.close();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (cn != null) {
                try {
                    cn.close();
                } catch (SQLException ex) {
                }
            }
        }
    }

    public Note GetNote(String email) {
        Connection cn = null;
        try {
            cn = createConnection();
            PreparedStatement pst = cn.prepareStatement("SELECT * FROM `notes` WHERE email = ?");
            pst.setString(1, email);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                Note n = new Note();
                n.setId(rs.getInt("id"));
                n.setFull_name(rs.getString("nom"));
                n.setEmail(rs.getString("email"));
                n.setSecurite(rs.getString("securite"));
                n.setReseau(rs.getString("reseau"));
                n.setJava(rs.getString("Java"));
                n.setPhp(rs.getString("php"));
                n.setAndroid(rs.getString("android"));
                n.setSgbd(rs.getString("sgbd"));
                n.setMath(rs.getString("math"));
                n.setFrancais(rs.getString("francais"));
                n.setAnglais(rs.getString("anglais"));
                n.setPfe(rs.getString("pfe"));
                return n;
            } else {
                return null;
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            if (cn != null) {
                try {
                    cn.close();
                } catch (SQLException ex) {
                }
            }
        }
    }

}
