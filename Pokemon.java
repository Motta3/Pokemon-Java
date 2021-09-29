/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;
import javax.swing.JOptionPane;
import pokemon.Poke;
/**
 *
 * @author motta
 */
public class Pokemon {
    public static int tamanho = 10;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Poke []p = new Poke[tamanho];
        
        //for (int i=0; i<tamanho; i++)
            
        String msg = "";
        int op;
        int i = 0;
        int []jg1= new int [3];
        int []jg2= new int [3];
        int vit1 = 0;
        int vit2 = 0;
        int cam;
        int ter = 0;
        
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog("Digite uma opcao:\n1 - Cadastrar Pokemon\n2 - Iniciar Batalha\n3 - Mostrar Pokemons\n0 - Sair"));
            switch(op){
                case 1:
                    if(i < tamanho){
                        p[i] = new Poke();
                        p[i].setNome(JOptionPane.showInputDialog("Digite o nome do pokemon: "));
                        p[i].setAgilidade(Integer.parseInt(JOptionPane.showInputDialog("Digite quanto ele tem de agilidade: ")));
                        p[i].setAtaque(Integer.parseInt(JOptionPane.showInputDialog("Digite quanto ele tem de ataque: ")));
                        p[i].setDefesa(Integer.parseInt(JOptionPane.showInputDialog("Digite quanto ele tem de defesa: ")));
                        p[i].setForca(Integer.parseInt(JOptionPane.showInputDialog("Digite quanto ele tem de forca: ")));

                        msg +=  i + " - " + p[i].getNome() + " - AG = " + p[i].getAgilidade() + " - ATK = " + p[i].getAtaque() + " - DEF = " + p[i].getDefesa() + " - FOR = " + p[i].getForca() + "\n";
                        i++;
                    }else JOptionPane.showMessageDialog(null, "Limite de pokemons atingido", "Atencao", JOptionPane.ERROR_MESSAGE);
                  
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Jogador 1, escolha 3 pokemons:\n");
                    
                    for(int j = 0; j < 3; j++){
                        jg1[j] = Integer.parseInt(JOptionPane.showInputDialog(msg));
                    }
                    
                    JOptionPane.showMessageDialog(null, "Jogador 2, escolha 3 pokemons:\n");
                    
                    for(int j = 0; j < 3; j++){
                        jg2[j] = Integer.parseInt(JOptionPane.showInputDialog(msg));
                    }
                    
                    ter = 0;
                    
                    while(ter < 3){
                       cam = Integer.parseInt(JOptionPane.showInputDialog("Escolha algum campo de poder:\n1 - Agilidade\n2 - Ataque\n3 - Defesa\n4 - Forca\n"));
                       
                        switch(cam){
                            case 1:
                                if(p[jg1[ter]].getAgilidade() > p[jg2[ter]].getAgilidade()){
                                    JOptionPane.showMessageDialog(null, "Vitoria do jogador 1 nesse round\n");
                                    vit1++;
                                }else if(p[jg1[ter]].getAgilidade() < p[jg2[ter]].getAgilidade()){
                                    JOptionPane.showMessageDialog(null, "Vitoria do jogador 2 nesse round\n");
                                    vit2++;
                                }else JOptionPane.showMessageDialog(null, "Empate\n");
                                
                                break;
                            case 2:
                                if(p[jg1[ter]].getAtaque() > p[jg2[ter]].getAtaque()){
                                    JOptionPane.showMessageDialog(null, "Vitoria do jogador 1 nesse round\n");
                                    vit1++;
                                }else if(p[jg1[ter]].getAtaque() < p[jg2[ter]].getAtaque()){
                                    JOptionPane.showMessageDialog(null, "Vitoria do jogador 2 nesse round\n");
                                    vit2++;
                                }else JOptionPane.showMessageDialog(null, "Empate\n");
                                
                                break;
                                
                            case 3:
                                if(p[jg1[ter]].getDefesa() > p[jg2[ter]].getDefesa()){
                                    JOptionPane.showMessageDialog(null, "Vitoria do jogador 1 nesse round\n");
                                    vit1++;
                                }else if(p[jg1[ter]].getDefesa() < p[jg2[ter]].getDefesa()){
                                    JOptionPane.showMessageDialog(null, "Vitoria do jogador 2 nesse round\n");
                                    vit2++;
                                }else JOptionPane.showMessageDialog(null, "Empate\n");
                                
                                break;
                                
                            case 4:
                                if(p[jg1[ter]].getForca() > p[jg2[ter]].getForca()){
                                    JOptionPane.showMessageDialog(null, "Vitoria do jogador 1 nesse round\n");
                                    vit1++;
                                }else if(p[jg1[ter]].getForca() < p[jg2[ter]].getForca()){
                                    JOptionPane.showMessageDialog(null, "Vitoria do jogador 2 nesse round\n");
                                    vit2++;
                                }else JOptionPane.showMessageDialog(null, "Empate no round\n");
                                
                                break;
                             default:
                                JOptionPane.showMessageDialog(null, "Opcao invalida", "Atencao", JOptionPane.ERROR_MESSAGE); 
                        }
                                               
                        ter++;
                    }
                    
                    if(vit1 > vit2){
                        JOptionPane.showMessageDialog(null, "Vitoria do jogador 1\n");
                    }else if(vit1 < vit2){
                        JOptionPane.showMessageDialog(null, "Vitoria do jogador 2\n");
                    }else JOptionPane.showMessageDialog(null, "Empate\n");
                    
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, msg);
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Saindo...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcao invalida", "Atencao", JOptionPane.ERROR_MESSAGE);
            }
            
        }while(op != 0);
        
    }
    
}
