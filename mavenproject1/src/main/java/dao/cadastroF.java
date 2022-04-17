package dao;
import conexao.conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.franquia;
public class cadastroF {
         public void cadastroDeAluno(){
         
     }
    public void cadastroF(franquia a){
     try {
            String SQL="INSERT INTO daniel_c_teixeira.franquia (endereco, numeroderegistro, quantidadedealunos,quantidadedeinstrutores, caixa )VALUES(?,?,?,?,?)";
            Connection minhaco=conexao.getConexao();
            PreparedStatement comando=minhaco.prepareStatement(SQL);
            comando.setString(1, a.getEndereco());
            comando.setString(2, a.getNumeroderegistro());
            comando.setString(3, a.getNumerodealunos());
            comando.setString(4, a.getQuantidadedeinstrutores());
            comando.setString(5, a.getCaixa());
            int retorno=comando.executeUpdate();
            minhaco.close();
            if(retorno>0){
               JOptionPane.showMessageDialog(null,"Franquia "+a.getNumeroderegistro()+" inserida com sucesso.");
            }else{
                JOptionPane.showMessageDialog(null,"erro no cadastro "+a.getNumeroderegistro());
            }
        } catch (SQLException ex) {
            Logger.getLogger(cadastroF.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        public List <franquia> listaF(){
        try {
            String SQL="SELECT nome,sobrenome,senha,e_mail FROM daniel_c_teixeira.franquia";
            List <franquia>listaDeAlunos=new ArrayList<franquia>();
            Connection c =conexao.getConexao();
            PreparedStatement ps=c.prepareStatement(SQL);
            ResultSet resultado = ps.executeQuery();
            while(resultado.next()){
                franquia atual = new franquia();
                atual = this.pegaDados(resultado);
                listaDeAlunos.add(atual);
            }
            
            return listaDeAlunos;
        } catch (SQLException ex) {
            Logger.getLogger(cadastroF.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    
    private franquia pegaDados(ResultSet resultado){
        try {
            franquia atual=new franquia();
            atual.setEndereco(resultado.getString("Endereco"));
            atual.setNumeroderegistro(resultado.getString("Numero de registro"));
            atual.setNumerodealunos(resultado.getString("Quantidade de Alunos"));
            atual.setQuantidadedeinstrutores(resultado.getString("Quantidade de Instrutores"));
            atual.setCaixa(resultado.getString("Caixa"));
            return atual;
        } catch (SQLException ex) {
            Logger.getLogger(cadastroF.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}