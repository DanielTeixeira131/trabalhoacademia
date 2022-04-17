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
import model.instrutor;
public class cadastroI {
         public void cadastroI(){
         
     }
    public void cadastroI(instrutor a){
     try {
            String SQL="INSERT INTO daniel_c_teixeira.instrutor (telefone, cpf, nome, salario)VALUES(?,?,?,?)";
            Connection minhaco=conexao.getConexao();
            PreparedStatement comando=minhaco.prepareStatement(SQL);
            comando.setString(1, a.getTelefone());
            comando.setString(2, a.getCpf());
            comando.setString(3, a.getNome());
            comando.setString(4, a.getSalario());
            int retorno=comando.executeUpdate();
            minhaco.close();
            if(retorno>0){
               JOptionPane.showMessageDialog(null,"instrutor "+a.getNome()+" inserido com sucesso.");
            }else{
                JOptionPane.showMessageDialog(null,"erro no cadastro "+a.getNome());
            }
        } catch (SQLException ex) {
            Logger.getLogger(cadastroI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        public List <instrutor> listaDeAlunos(){
        try {
            String SQL="SELECT nome,sobrenome,senha,e_mail FROM daniel_c_teixeira.instrutor";
            List <instrutor>listaDeAlunos=new ArrayList<instrutor>();
            Connection c =conexao.getConexao();
            PreparedStatement ps=c.prepareStatement(SQL);
            ResultSet resultado = ps.executeQuery();
            while(resultado.next()){
                instrutor atual = new instrutor();
                atual = this.pegaDados(resultado);
                listaDeAlunos.add(atual);
            }
            
            return listaDeAlunos;
        } catch (SQLException ex) {
            Logger.getLogger(cadastroI.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    
    private instrutor pegaDados(ResultSet resultado){
        try {
            instrutor atual=new instrutor();
            atual.setTelefone(resultado.getString("nome"));
            atual.setCpf(resultado.getString("sobrenome"));
            atual.setNome(resultado.getString("senha"));
            atual.setSalario(resultado.getString("e_mail"));
            atual.setCpf(resultado.getString("cpf"));
            return atual;
        } catch (SQLException ex) {
            Logger.getLogger(cadastroI.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}