package janelas;

import java.awt.Color;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import escalonadores.Fifo;
import escalonadores.RoundRobin;
import escalonadores.SJF;
import escalonadores.SRT;

public class MyCheckBox extends JFrame {
	public ArrayList<Escalonador> escalonadores;
	private ArrayList<Processo> processos;
	private ArrayList test;
	private JButton start;
	private JButton sair;

	private JCheckBox jcbfifo;
	private JCheckBox jcbsjf;
	private JCheckBox jcbsrt;
	private JCheckBox jcbrr;

	private JTextField Jtext2;
	private JTextField Jtext1;

	private int timeSlice;
	private int tempoDeTroca;

	private Fifo fifo;
	private SJF sjf;
	private SRT srt;
	private RoundRobin rr;

	private JLabel lbTime = new JLabel("<< Time Slice >>");
	private JLabel lbTroca = new JLabel("<< Time de Troca >>");
	private Image imagem;

	private final String colunas[] = { "Nome:", "Idade:", "Sexo:" };
	private final String dados[][] = { { "Jack", "19", "Masculino" }, { "Eddie", "56", "Masculino" },
			{ "Gina", "34", "Feminino" }, { "Klaus", "18", "Masculino" }, { "Erika", "20", "Feminino" },
			{ "Roberto", "29", "Masculino" }, { "Maria", "30", "Feminino" } };
	private JTable table;

	public MyCheckBox() {

		super("Stepper Simulator");
		// getContentPane().setBackground(new Color(123,342,442));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setSize(800, 550);
		setLocationRelativeTo(null);
		ImageIcon referencia = new ImageIcon("recursos//fundo.png");
		imagem = referencia.getImage();
		setLayout(new FlowLayout());

		ArrayList escalonadores = new ArrayList<Escalonador>();
		ArrayList processos = new ArrayList<Processo>();

		table = new JTable(dados, colunas);
		table.setPreferredScrollableViewportSize(new Dimension(500, 100));// barra
																			// de
																			// rolagem
		table.setFillsViewportHeight(true);

		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(0, 500, 100, 30);
		fifo = new Fifo();
		sjf = new SJF();
		srt = new SRT();
		rr = new RoundRobin();

		// Criando os JCheckBox
		// SRT (Shortest Remaining Time

		jcbfifo = new JCheckBox("FIFO");
		jcbsjf = new JCheckBox("Shortest Job First");
		jcbsrt = new JCheckBox("Shortest Remaining Time");
		jcbrr = new JCheckBox("Round-Robin");

		start = new JButton("Simular");
		start.setBounds(300, 300, 100, 30);
		start.setBorder(null);
		start.setVisible(true);

		sair = new JButton("Sair");
		sair.setBounds(30, 60, 100, 30);
		sair.setVisible(true);
		sair.setBorder(null);

		Jtext1 = new JTextField("Insera o Time Slice");
		Jtext1.setBounds(85, 420, 60, 30);

		Jtext1.addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent arg0) {
				Jtext1.setText("");
			}

		});

		Jtext2 = new JTextField("Insera o Tempo de Troca");
		Jtext2.setBounds(175, 420, 60, 30);

		Jtext2.addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent arg0) {
				Jtext2.setText("");
			}

		});
		// c.setMnemonic(KeyEvent.VK_C);

		// Criando e adicionando o handler
		CheckBoxHandler tratador = new CheckBoxHandler();
		jcbfifo.addItemListener(tratador);
		jcbsjf.addItemListener(tratador);
		jcbsrt.addItemListener(tratador);
		jcbrr.addItemListener(tratador);

		// start("Start", 10, 160);
		// Sair("Sair", 40, 100);
		// Adicionando os JCheckBox no Layout

		add(jcbfifo);
		add(jcbsjf);
		add(jcbsrt);
		add(jcbrr);
		add(lbTime);
		add(Jtext1);
		add(lbTroca);
		add(Jtext2);
		add(scrollPane);
		add(sair);
		add(start);

		// add(linguagens);
		acao();
		setVisible(true);
	}

	void acao() {
		start.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent a) {

			}

		});

		sair.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent a) {
				System.exit(0);

			}
		});
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

	private class CheckBoxHandler implements ItemListener {

		@Override
		public void itemStateChanged(ItemEvent evento) {

			if (jcbfifo.isSelected()) {
				escalonadores.add((Escalonador) fifo);
			}

			if (jcbsjf.isSelected()) {
				// escalonadores.add((Escalonador) sjf);
			}
			if (jcbsrt.isSelected()) {
				// escalonadores.add((Escalonador) srt);
			}

			if (jcbrr.isSelected()) {

			}

			// escalonadores.add((Escalonador)rr);

			// linguagens.setText( escalonadores.size() );

		}

	}

	public void paint(Graphics g) {

		Graphics2D graficos = (Graphics2D) g;
		graficos.drawImage(imagem, 0, 0, null);

		// graficos.drawImage(carro1, 350, 300, null);

	}

	private void addFifo() {

		escalonadores.add((Escalonador) fifo);
	}

	public static void main(String[] args) {
		MyCheckBox box = new MyCheckBox();
	}

}
