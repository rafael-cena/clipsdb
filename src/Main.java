import siseventos.db.util.Conexao;

import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SingletonDB.conectar();
        Clip clip; // = new Clip("Taylor Swift", "Taylor Perdigão", 220, LocalDate.of(2024,01,15), "https://youtube.com/");
        ClipDAL dal = new ClipDAL(); //Data Access Layer -> Camada de Acesso de Dados
//        dal.inserir(clip);
        List<Clip> clips;
        clips=dal.get("clp_artista LIKE 'MATO GROSSO%'");

        for (Clip c:clips) {
            System.out.println(c.getArtista());
        }

//        System.out.println(clip.getArtista());
//        dal.apagar(clip);
//        clip.setArtista(clip.getArtista().toUpperCase());
//        dal.alterar(clip);
//        System.out.println(clip.getArtista());


//                  U S A N D O   C L A S S E   C O N E X A O
//        String insert = """
//                    INSERT INTO clip(
//                    clp_id, clp_artista, clp_titulo, clp_duracao, clp_pubdata, clp_url)
//                    VALUES (DEFAULT, '#1', '#2', #3, '#4', '#5');""";
//        insert = insert.replace("#1", "Taylor Swift");
//        insert = insert.replace("#2", "Taylor");
//        insert = insert.replace("#3", "200");
//        insert = insert.replace("#4", "2024-01-10");
//        insert = insert.replace("#5", "https://youtube.com/");
//
//        Conexao conexao = new Conexao();
//        conexao.conectar("jdbc:postgresql://localhost:5432/", "db_musics", "postgres", "postgres123");
//        if (conexao.getEstadoConexao()) {
//            if (conexao.manipular(insert))
//                System.out.println("deu certo!");
//            else
//                System.out.println("deu ruim! " + conexao.getMensagemErro());
//        }


//        Connection connection;
//        String url = "jdbc:postgresql://localhost:5432/db_musics";

//                  S E L E C T

//        String select = "SELECT * FROM clip";
//        try {
//            connection = DriverManager.getConnection(url, "postgres", "postgres123");
//            Statement statement = connection.createStatement();
//            ResultSet resultSet = statement.executeQuery(select);
////            resultSet.next(); -> vai pro proximo
////            resultSet.previous() -> vai pro anterior
////            resultSet.first() -> vai pro primeiro
////            resultSet.last() -> vai pro ultimo
//            while (resultSet.next()) {
//                System.out.println(resultSet.getString(2)); //as colunas comecam do 1
//                System.out.println(resultSet.getString("clp_titulo")); //pode indicar a coluna pelo nome
//            }

//        } catch (Exception e) {
//            System.out.println("Erro: " + e.getMessage());
//        }



//                  I N S E R T ,  U P D A T E ,  D E L E T E

//        String insert = """
//                    INSERT INTO clip(
//                    clp_id, clp_artista, clp_titulo, clp_duracao, clp_pubdata, clp_url)
//                    VALUES (DEFAULT, '#1', '#2', #3, '#4', '#5');""";
//        String update = "UPDATE clip SET clp_titulo='Taylor Perdigão' WHERE clp_id=9;";
//        String delete = "DELETE FROM clip WHERE clp_id=8";
//        insert = insert.replace("#1", "Taylor Swift");
//        insert = insert.replace("#2", "Taylor");
//        insert = insert.replace("#3", "200");
//        insert = insert.replace("#4", "2024-01-10");
//        insert = insert.replace("#5", "https://youtube.com/");
//
//        System.out.println(insert);
//        System.out.println(update);
//        System.out.println(delete);
//
//        try {
//            connection = DriverManager.getConnection(url, "postgres", "postgres123");
//            Statement statement = connection.createStatement();
//            statement.executeUpdate(delete);
//
//        } catch (Exception e) {
//            System.out.println("Erro: " + e.getMessage());
//        }
    }
}