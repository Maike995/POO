
package sistema;

public abstract class  Usuario {
    
    
    protected String nome;
    protected String senha;

     public Usuario(String nome, String senha){
      this.nome=nome;
      this.senha=senha;
      }
  
    public String getNome(){
        return nome;
    }
    public String getSenha(){
        return senha;
    }
    
    public void setNome(String nome){
        this.nome=nome;
    }
    public void setSenha(String senha){
        this.senha=senha;
    }
    
    
    
}
