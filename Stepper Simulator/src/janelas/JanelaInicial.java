package janelas;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

public class JanelaInicial extends JFrame {

	private JButton bt1;
	private JButton bt2;
	private JButton bt3;
	private JButton bt4;
	private JButton bt5;
	private JButton bt6;
	private JButton start;
	private JButton sair;
	private Image imagem;
	
	
	private int carroPiloto1;
	private int carroPiloto2;
	private JTextField Jtext2;
	private JTextField Jtext1;

	private String nJogador1;
	private String nJogador2;
	 
	 private JCheckBox java, php, csharp, c;
	 private JLabel linguagens;

	public JanelaInicial() {

		botao1("carro 1", 110, 300);
		botao2("carro 2", 110, 340);
		botao3("carro 3", 110, 380);

		botao4("carro 1", 560, 300);
		botao5("carro 2", 560, 340);
		botao6("carro 3", 560, 380);
		start("Start", 250, 460);
		Sair("Sair", 420, 460);
		nome1();
		nome2();

		

		

		// selecaoCarro1 = new Imagem(30, 40, "recursos\\selecao.png");
		// selecaoCarro2 = new Imagem(560, 360, "recursos\\selecao.png");

		acao();
		setSize(800, 550);
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		setResizable(false);
		//ImageIcon referencia = new ImageIcon("recursos/fundoEscolha.jpg");
	//	imagem = referencia.getImage();
		 setVisible(true);
		 JLabel linguagens = new JLabel("Linguagens selecionadas: ");

		//Criando os JCheckBox
		  JCheckBox java = new JCheckBox("Java");
		  JCheckBox php = new JCheckBox("PHP");
		  JCheckBox  csharp = new JCheckBox("C#");
		  JCheckBox  c = new JCheckBox("C");
		  
		  //Criando e adicionando o handler
		  CheckBoxHandler tratador = new CheckBoxHandler();
		  java.addItemListener((ItemListener) tratador);
		  php.addItemListener(tratador);
		  csharp.addItemListener(tratador);
		  c.addItemListener(tratador);
		  
		  //Adicionando os JCheckBox no Layout
		  add(java);
		  add(php);
		  add(csharp);
		  add(c);
		  add(linguagens);

	
		
		
	}

	 private class CheckBoxHandler implements ItemListener{
	  private String texto = ""; 
	  
	  @Override
	  	public void itemStateChanged(ItemEvent evento) {
		  texto = ""; 
		  if(java.isSelected()){
			  texto += "Java ";
		  }
		  if(php.isSelected()){
			  texto += "PHP ";
		  }
		  if(csharp.isSelected()){
			  texto += "C# ";
		  }
		  if(c.isSelected()){
			  texto += "C# ";
		  }

		   linguagens.setText("Linguagens selecionadas: "+texto);
	   }

	   
	  }
	void nome1() {
		Jtext1 = new JTextField("Player1");
		Jtext1.setBounds(85, 420, 150, 30);

		add(Jtext1);

	}

	void nome2() {
		Jtext2 = new JTextField("Player2");
		Jtext2.setBounds(535, 420, 150, 30);

		add(Jtext2);

	}

	void botao1(String nome, int x, int y) {

		setLayout(null);
		bt1 = new JButton(nome);
		bt1.setBounds(x, y, 100, 30);
		bt1.setVisible(true);
		bt1.setBorder(null);
		bt1.setBackground(Color.GREEN);
		add(bt1);

	}

	void botao2(String nome, int x, int y) {
		setBackground(Color.GREEN);
		setLayout(null);
		bt2 = new JButton(nome);
		bt2.setBounds(x, y, 100, 30);
		bt2.setVisible(true);
		bt2.setBorder(null);
		bt2.setBackground(Color.GREEN);
		add(bt2);

	}

	void botao3(String nome, int x, int y) {
		setBackground(Color.GREEN);
		setLayout(null);
		bt3 = new JButton(nome);
		bt3.setBounds(x, y, 100, 30);
		bt3.setVisible(true);
		bt3.setBorder(null);
		bt3.setBackground(Color.GREEN);
		add(bt3);

	}

	void botao4(String nome, int x, int y) {
		setBackground(Color.GREEN);
		setLayout(null);
		bt4 = new JButton(nome);
		bt4.setBounds(x, y, 100, 30);
		bt4.setVisible(true);
		bt4.setBorder(null);
		bt4.setBackground(Color.GREEN);
		add(bt4);
	}

	void botao5(String nome, int x, int y) {
		setBackground(Color.GREEN);
		setLayout(null);
		bt5 = new JButton(nome);
		bt5.setBounds(x, y, 100, 30);
		bt5.setVisible(true);
		bt5.setBorder(null);
		bt5.setBackground(Color.GREEN);
		add(bt5);
	}

	void botao6(String nome, int x, int y) {

		setLayout(null);
		bt6 = new JButton(nome);
		bt6.setBounds(x, y, 100, 30);
		bt6.setVisible(true);
		bt6.setBorder(null);
		bt6.setBackground(Color.GREEN);
		add(bt6);
	}

	void start(String nome, int x, int y) {
		
		setBackground(Color.GREEN);
		setLayout(null);
		start = new JButton(nome);
		start.setBounds(x, y, 100, 30);
		start.setVisible(true);
	
		start.setBorder(null);
		add(start);
	}

	void Sair(String nome, int x, int y) {
		setBackground(Color.GREEN);
		setLayout(null);
		sair = new JButton(nome);
		sair.setBounds(x, y, 100, 30);
		sair.setVisible(true);
		sair.setBorder(null);
				
		add(sair);
	}

	public void carroJaEscolhido() {
		JOptionPane.showMessageDialog(null,
				"Este carro foi escolhido pelo seu adversario",
				"ESCOLHA OUTRO CARRO", JOptionPane.INFORMATION_MESSAGE);
	}

	void acao() {
		bt1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent a) {

				if (carroPiloto2 != 1) {
					carroPiloto1 = 1;
					bt1.setBackground(Color.YELLOW);
					bt2.setBackground(Color.GREEN);

					bt3.setBackground(Color.GREEN);

				} else {
					carroJaEscolhido();
				}
			}
		});

		bt2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent a) {
				if (carroPiloto2 != 2) {
					carroPiloto1 = 2;
					bt1.setBackground(Color.GREEN);
					bt2.setBackground(Color.YELLOW);
					bt3.setBackground(Color.GREEN);
				} else {
					carroJaEscolhido();
				}
				;
			}
		});

		bt3.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent a) {
				if (carroPiloto2 != 3) {
					carroPiloto1 = 3;
					bt1.setBackground(Color.GREEN);
					bt2.setBackground(Color.GREEN);
					bt3.setBackground(Color.YELLOW);
				} else {
					carroJaEscolhido();
				}
			}
		});

		bt4.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent a) {
				if (carroPiloto1 != 1) {
					carroPiloto2 = 1;
					bt4.setBackground(Color.YELLOW);
					bt5.setBackground(Color.GREEN);
					bt6.setBackground(Color.GREEN);
				} else {
					carroJaEscolhido();
				}
			}
		});

		bt5.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent a) {
				if (carroPiloto1 != 2) {
					carroPiloto2 = 2;
					bt4.setBackground(Color.GREEN);
					bt5.setBackground(Color.YELLOW);
					bt6.setBackground(Color.GREEN);
				} else {
					carroJaEscolhido();
				}
			}
		});

		bt6.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent a) {
				if (carroPiloto1 != 3) {
					carroPiloto2 = 3;
					bt4.setBackground(Color.GREEN);
					bt5.setBackground(Color.GREEN);
					bt6.setBackground(Color.YELLOW);
				} else {
					carroJaEscolhido();
				}
			}
		});

		start.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent a) {
				nJogador1 = Jtext1.getText();
				nJogador2 = Jtext2.getText();
                System.out.println(nJogador1);
				
                if (( nJogador1.equals ("") ) || (nJogador2.equals(""))) {
					JOptionPane.showMessageDialog(null,
							"Por favor, escreva seu nome ",
							"DIGITE O NOME DO JOGADOR",
							JOptionPane.INFORMATION_MESSAGE);
                } else if ((carroPiloto1 == 0) || (carroPiloto2 == 0)) {
					JOptionPane.showMessageDialog(null,
							"Por favor, escolha o carro ",
							"CARRO AINDA N�O ESCOLHIDO",
							JOptionPane.INFORMATION_MESSAGE);
				
				} else{

				//	Janela j = new Janela( nJogador1 , carroPiloto1, nJogador1, carroPiloto2);
				//	j.setVisible(true);
					dispose();
				}

			}
		});

		sair.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent a) {
				System.exit(0);

			}
		});

	}

	public void paint(Graphics g) {

		Graphics2D graficos = (Graphics2D) g;
		graficos.drawImage(imagem, 0, 0, null);
		
		// graficos.drawImage(carro1, 350, 300, null);

	}
/*
	public static void main(String[] args) {
		new JanelaInicial();

	}
*/
}
