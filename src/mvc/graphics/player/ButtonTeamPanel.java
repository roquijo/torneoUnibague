package mvc.graphics.player;

import mvc.graphics.InterfaceTournament;

import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonTeamPanel extends JPanel implements ActionListener {

    private static final String ADD_PLAYER = "AgregarJugador";

    private static final String DELETE_PLAYER = "EliminarJugador";

    private static final String MODIFY_PLAYER = "ModificarJugador";

    private JButton addPlayer;

    private JButton deletePlayer;

    private JButton modifyPlayer;

    public ButtonTeamPanel( )
    {
        setBorder( new CompoundBorder( new EmptyBorder(0 , 0, 0, 0 ), new TitledBorder( "Opciones" ) ) );
        setLayout( new GridLayout( 3, 1 ));

        addPlayer = new JButton( "Agregar Jugador" );
        addPlayer.setActionCommand(ADD_PLAYER);
        addPlayer.addActionListener( this );
        add(addPlayer);

        deletePlayer = new JButton( "Eliminar Jugador" );
        deletePlayer.setActionCommand(DELETE_PLAYER);
        deletePlayer.addActionListener( this );
        add(deletePlayer);

        modifyPlayer = new JButton( "Modificar Jugador" );
        modifyPlayer.setActionCommand(MODIFY_PLAYER);
        modifyPlayer.addActionListener( this );
        add(modifyPlayer);

    }

    public void actionPerformed( ActionEvent evento ) {
        String comando = evento.getActionCommand();
    }
}