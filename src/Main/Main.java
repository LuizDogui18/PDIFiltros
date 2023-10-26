package Main;
import Methods.Binarizar;
import Methods.DetectarBordas;
import Methods.InverterCores;
import Methods.Suavizar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.IOException;
import java.io.File;

public class Main {
    private JFrame frame;
    private JButton carregarImagem;
    private JLabel imageLabel;
    private JButton suavizarImagem;
    private JButton binarizarImagem;
    private JButton inverterCores;
    private JButton bordas1;
    private JButton bordas2;
    private JButton bordas3;
    private JButton bordas4;
    private JButton bordas5;
    private JButton bordas6;
    private JButton bordas7;

    private BufferedImage imagem;

    public Main() {
        frame = new JFrame("Filtros de Imagem");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        imageLabel = new JLabel();
        JScrollPane scrollPane = new JScrollPane(imageLabel);
        frame.add(scrollPane, BorderLayout.CENTER);

        JPanel barrinhaDeBotoes = new JPanel();
        carregarImagem = new JButton("Carregar Imagem");
        suavizarImagem = new JButton("Suavizar Imagem");
        binarizarImagem = new JButton("Binarizar Imagem");
        inverterCores = new JButton("Inverter Cores da Imagem");
        bordas1 = new JButton("Bordas 1");
        bordas2 = new JButton("Bordas 2");
        bordas3 = new JButton("Bordas 3");
        bordas4 = new JButton("Bordas 4");
        bordas5 = new JButton("Bordas 5");
        bordas6 = new JButton("Bordas 6");
        bordas7 = new JButton("Bordas 7");

        barrinhaDeBotoes.add(carregarImagem);
        barrinhaDeBotoes.add(suavizarImagem);
        barrinhaDeBotoes.add(binarizarImagem);
        barrinhaDeBotoes.add(inverterCores);
        barrinhaDeBotoes.add(bordas1);
        barrinhaDeBotoes.add(bordas2);
        barrinhaDeBotoes.add(bordas3);
        barrinhaDeBotoes.add(bordas4);
        barrinhaDeBotoes.add(bordas5);
        barrinhaDeBotoes.add(bordas6);
        barrinhaDeBotoes.add(bordas7);

        frame.add(barrinhaDeBotoes, BorderLayout.SOUTH);

        carregarImagem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int returnValue = fileChooser.showOpenDialog(null);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    try {
                        imagem = ImageIO.read(selectedFile);
                        mostrarImagem(imagem);
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });

        suavizarImagem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (imagem != null) {
                    BufferedImage imagemFinal = null;
                    try {
                        imagemFinal = Suavizar.aplicarFiltro(imagem);
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    mostrarImagem(imagemFinal);
                }
            }
        });

        binarizarImagem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (imagem != null) {
                    BufferedImage imagemSaida = null;
                    try {
                        imagemSaida = Binarizar.binarizarImagem(imagem);
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    mostrarImagem(imagemSaida);
                }
            }
        });

        inverterCores.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (imagem != null) {
                    BufferedImage imagemSaida = null;
                    try {
                        imagemSaida = InverterCores.inverterCores(imagem);
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    mostrarImagem(imagemSaida);
                }
            }
        });

        bordas1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (imagem != null) {
                    BufferedImage imagemSaida = null;
                    try {
                        imagemSaida = DetectarBordas.tipo1(imagem);
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    mostrarImagem(imagemSaida);
                }
            }
        });

        bordas2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (imagem != null) {
                    BufferedImage imagemSaida = null;
                    try {
                        imagemSaida = DetectarBordas.tipo2(imagem);
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    mostrarImagem(imagemSaida);
                }
            }
        });

        bordas3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (imagem != null) {
                    BufferedImage imagemSaida = null;
                    try {
                        imagemSaida = DetectarBordas.tipo3(imagem);
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    mostrarImagem(imagemSaida);
                }
            }
        });

        bordas4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (imagem != null) {
                    BufferedImage imagemSaida = null;
                    try {
                        imagemSaida = DetectarBordas.tipo4(imagem);
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    mostrarImagem(imagemSaida);
                }
            }
        });

        bordas5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (imagem != null) {
                    BufferedImage imagemSaida = null;
                    try {
                        imagemSaida = DetectarBordas.tipo5(imagem);
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    mostrarImagem(imagemSaida);
                }
            }
        });

        bordas6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (imagem != null) {
                    BufferedImage imagemSaida = null;
                    try {
                        imagemSaida = DetectarBordas.tipo6(imagem);
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    mostrarImagem(imagemSaida);
                }
            }
        });

        bordas7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (imagem != null) {
                    BufferedImage imagemSaida = null;
                    try {
                        imagemSaida = DetectarBordas.tipo7(imagem);
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    mostrarImagem(imagemSaida);
                }
            }
        });

        frame.setVisible(true);
    }

    private void mostrarImagem(BufferedImage image) {
        ImageIcon imageIcon = new ImageIcon(image);
        imageLabel.setIcon(imageIcon);
        imageLabel.revalidate();
        imageLabel.repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main();
            }
        });
    }
}

