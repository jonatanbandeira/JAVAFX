package javafxmvc.model.database;

public class DatabaseFactory {
    public static Database getDatabase(String nome){
        if(nome.equals("postgresql")){
            return new DatabasePostgreSQL();
        }else if(nome.equals("mysql")){
            return new DatabaseMySQL();
        }
        return null;
    }

    public void getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
