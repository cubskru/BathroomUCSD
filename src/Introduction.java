import objectdraw.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Introduction extends WindowController
                          implements ActionListener {

  private Image toilet;

  private VisibleImage toiletPic;

  private JButton revelleCollege, muirCollege, marshallCollege,
                  ercCollege, warrenCollege, sixthCollege;

  private JLabel titleLabel;

  private JPanel northPanel, southPanel;

  public void begin() {

    toilet = getImage( "toilet-talk1.jpg" );

    toiletPic = new VisibleImage( toilet, (canvas.getWidth()/4) - 15, (canvas.getHeight()/4) - 75, canvas );

    northPanel = new JPanel();
    southPanel = new JPanel();

    titleLabel = new JLabel("Looking for a Bathroom?", JLabel.CENTER);

    revelleCollege = new JButton( "Revelle" );
    muirCollege = new JButton( "Muir" );
    marshallCollege = new JButton( "Marshall " );
    ercCollege = new JButton( "ERC " );
    warrenCollege = new JButton( "Warren " );
    sixthCollege = new JButton( "Sixth " );

    southPanel.setLayout( new GridLayout( 6, 2 ) );

    northPanel.add( titleLabel );

    southPanel.add( revelleCollege );
    southPanel.add( muirCollege );
    southPanel.add( marshallCollege );
    southPanel.add( ercCollege );
    southPanel.add( warrenCollege );
    southPanel.add( sixthCollege );

    revelleCollege.addActionListener( this );
    muirCollege.addActionListener( this );
    marshallCollege.addActionListener( this );
    ercCollege.addActionListener( this );
    warrenCollege.addActionListener( this );
    sixthCollege.addActionListener( this );

    Container contentPane = getContentPane();
    contentPane.add( northPanel, BorderLayout.NORTH );
    contentPane.add( southPanel, BorderLayout.SOUTH );
    contentPane.validate();

 }

 public void actionPerformed( ActionEvent evt ) {

 }

}

    
