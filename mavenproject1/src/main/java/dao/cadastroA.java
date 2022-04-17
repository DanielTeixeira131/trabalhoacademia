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
import model.aluno;
public class cadastroA {
         public void cadastroA(){
         
     }
    public void cadastroA(aluno a){
     try {
            String SQL="INSERT INTO daniel_c_teixeira.aluno (telefone, cpf, nome, peso, idade, genero, altura)VALUES(?,?,?,?,?,?,?)";
            Connection minhaco=conexao.getConexao();
            PreparedStatement comando=minhaco.prepareStatement(SQL);
            comando.setString(1, a.getTelefone());
            comando.setString(2, a.getCpf());
            comando.setString(3, a.getNome());
            comando.setString(4, a.getPeso());
            comando.setString(5, a.getIdade());
            comando.setString(6, a.getGenero());
            comando.setString(7, a.getAltura());
            int retorno=comando.executeUpdate();
            minhaco.close();
            if(retorno>0){
               JOptionPane.showMessageDialog(null,"Aluno "+a.getNome()+" inserido com sucesso.");
            }else{
                JOptionPane.showMessageDialog(null,"Erro no cadastro "+a.getNome());
            }
        } catch (SQLException ex) {
            Logger.getLogger(cadastroA.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        public List <aluno> listaDeAlunos(){
        try {
            String SQL="SELECT telefone, cpf, nome, peso, idade, genero, altura FROM daniel_c_teixeira.aluno";
            List <aluno>listaDeAlunos=new ArrayList<aluno>();
            Connection c =conexao.getConexao();
            PreparedStatement ps=c.prepareStatement(SQL);
            ResultSet resultado = ps.executeQuery();
            while(resultado.next()){
                aluno atual = new aluno();
                atual = this.pegaDados(resultado);
                listaDeAlunos.add(atual);
            }
            
            return listaDeAlunos;
        } catch (SQLException ex) {
            Logger.getLogger(cadastroA.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    
    private aluno pegaDados(ResultSet resultado){
        try {
            aluno atual=new aluno();
            atual.setTelefone(resultado.getString("Telefone"));
            atual.setCpf(resultado.getString("Cpf"));
            atual.setNome(resultado.getString("Nome"));
            atual.setPeso(resultado.getString("Peso"));
            atual.setIdade(resultado.getString("Idade"));
            atual.setGenero(resultado.getString("Genero"));
            atual.setAltura(resultado.getString("Altura"));
            return atual;
        } catch (SQLException ex) {
            Logger.getLogger(cadastroA.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}