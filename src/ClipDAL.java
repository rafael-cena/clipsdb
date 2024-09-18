import siseventos.db.util.Conexao;

public class ClipDAL {

    public boolean inserir(Clip clip) {
        String insert = """
                    INSERT INTO clip(
                    clp_id, clp_artista, clp_titulo, clp_duracao, clp_pubdata, clp_url)
                    VALUES (DEFAULT, '#1', '#2', #3, '#4', '#5');""";
        insert = insert.replace("#1", clip.getArtista());
        insert = insert.replace("#2", clip.getTitulo());
        insert = insert.replace("#3", ""+clip.getDuracao());
        insert = insert.replace("#4", clip.getPubdata().toString());
        insert = insert.replace("#5", clip.getUrl());

        Conexao conexao = new Conexao();
        conexao.conectar("jdbc:postgresql://localhost:5432/", "db_musics", "postgres", "postgres123");
        if (conexao.getEstadoConexao()) {
            if (conexao.manipular(insert))
                return true;
            else
                return false;
        }
        return false;
    }
}
