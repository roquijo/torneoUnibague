package mvc.graphics;

import mvc.controller.ControllerBuildObject;
import mvc.graphics.banner.PanelBanner;
import mvc.graphics.faculty.FacultyPanel;
import mvc.graphics.player.PlayerPanel;
import mvc.graphics.team.TeamPanel;

import javax.swing.*;
import java.awt.*;

//Interface Main
public class InterfaceTournament extends  JFrame{

    private ControllerBuildObject builderObject;
    private FacultyPanel facultyPanel;
    private TeamPanel teamPanel;
    private PlayerPanel playerPanel;
    private PanelBanner panelBanner;

    public InterfaceTournament() {

        //builderObject = object;
        setTitle("Torneo Unibague");
        setLayout( new GridLayout( 4, 1 ));
        setSize( 950, 710 );
        setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
        setLocationRelativeTo(null);
        setResizable(false);

        panelBanner = new PanelBanner(this);
        add(panelBanner);

        facultyPanel = new FacultyPanel( this );
        facultyPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null,
        "Facultades", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
        javax.swing.border.TitledBorder.DEFAULT_POSITION,
         new java.awt.Font("Arial", 3, 20)));
        add(facultyPanel );

        teamPanel = new TeamPanel( this );
        teamPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null,
                "Equipos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
                javax.swing.border.TitledBorder.DEFAULT_POSITION,
                 new java.awt.Font("Arial", 3, 20)));
        add(teamPanel);

        playerPanel = new PlayerPanel( this );
        playerPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null,
                        "Jugadores", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
                        javax.swing.border.TitledBorder.DEFAULT_POSITION,
                         new java.awt.Font("Arial", 3, 20)));
        add(playerPanel);

        setVisible( true );
    }
/*
    JComboBox comboFacultad = new JComboBox();

    NodeList<Requistdatabsae.get> facultyList = new NodeList<>();
    FacultyDao faculty = new FacultyDao();
    FacultyDto facultyDto = new FacultyDto();
    facultyList = faculty.read(facultyDto);
        for (int i = 0; i < facultyList.getSize(); i++) {
        comboFacultad.addItem(facultyList.pop(i).getName());
    }


        comboFacultad.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        }
    });*/
/*
    public static void main(String[] args) {
        InterfaceTournament gui = new InterfaceTournament();
        JFrame frame = new JFrame("Torneo Futbol Universidad De Ibagué");
        frame.setContentPane((gui.panelPrincipal));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
 */
    /*
    public static void main( String[] args )
    {/*
        BuilderObject builderObject = null;

        try
        {
            builderObject = new BuilderObject( "./data/Equipos.txt" );
        }
        catch( PersistenciaException e )
        {
            e.printStackTrace( );
            System.exit( 1 );
        }
        
        InterfaceTournament id = new InterfaceTournament( );
        id.setVisible( true );
    }
    
     */
}
