import java.awt.*;
import objectdraw.*;

public class RoomInfo extends WindowController{
	//private final String "College";
	//private final building "Building";
	
	private Bathroom Room;
	private String college;
	private String building;
	private int level;
	private String gender;
	private boolean isWheelChairAccessible;
	private boolean isFamilyAccesible;
	
	private JPanel topPanel;
	private JLabel Bathroom;
	private JPanel LocationPanel;
	
	private JLabel LocationLabels;
	private JLabel LocationInfo;
	/*private JLabel College;
	private JLabel Building;
	private JLabel Level;*/
	
	public RoomInfo(Bathroom currentRoom){
		this.Room = currentRoom;
		run();
	}

	public void run(){
		topPanel = new JPanel(new BorderLayout());
		Bathroom = new JLabel("Bathroom");
		contentPane.add(topPanel, BorderLayout.NORTH);
		topPanel.add(Bathroom, BorderLayout.NORTH);
		
		LocationPanel = new JPanel(new BorderLayout());
		topPanel.add(Location, BorderLayout.SOUTH);
		
		/*College = new JLabel("College");
		Building = new JLabel("Building");
		Level = new JLabel("Level");*/
		
		LocationLabels = new JLabel("College" + "\n" + "Building" +
						"\n" + "Level" + "\n");
		LocationInfo = new JLabel(Room.getCollege() + "\n" + Room.getBuilding() + "\n"
						+ Room.getLevel() + "\n");	
		LocationPanel.add(LocationLabels, BorderLayout.WEST);
		LocatonPanel.add(LocationInfo, BorderLayout.EAST);


		
			
	}

	
}

