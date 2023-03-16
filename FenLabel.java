import java.awt.*; import java.awt.event.*; import javax.swing.* ;
class FenLabel extends JFrame implements ActionListener{
public FenLabel(){
setTitle("Essai Etiquettes"); setSize(300, 120) ;
Container contenu = getContentPane() ;
contenu.setLayout(new FlowLayout() ) ;
bouton = new JButton("Compteur") ;
bouton.addActionListener(this) ;
contenu.add(bouton) ;
nbClics = 0 ;
compte = new JLabel("Nombre de clics sur Compteur = "+ nbClics);
contenu.add(compte);
}
public void actionPerformed(ActionEvent e){
nbClics++;
compte.setText("Nombre de clics sur Compteur = "+nbClics);
}
private JButton bouton; private JLabel compte; private int nbClics;
}
public class TestJLabel{
public static void main (String args[]){
FenLabel fen = new FenLabel();
fen.setVisible(true);
}