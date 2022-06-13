package application;

import java.util.Random;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class AskManager {
		
		private int flag;
		private Double x;
		private Double y;
		
	  	@FXML private Button yesButton;

	    @FXML private Button NoButton;
	    
	    public AskManager() {
	    	flag=4;
	    	x= new Double(0);
	    	y=new Double(0);
		}
	    
	    private void positionButton() {
	    	Random _rd= new Random();
	    	int _flag =0;
	    	do {
				_flag=_rd.nextInt(4);
			} while (_flag==flag);
	    	flag=_flag;
	    	switch (_flag) {
			case 1:
				x=(double) _rd.nextInt(76);
				y=(double) _rd.nextInt(43);
				return ;				
			case 2:
				x=(double) (_rd.nextInt(100)-210);
				y=(double) (_rd.nextInt(43)-150);
				return ;
			case 3:
				x=(double) (_rd.nextInt(76)-210);
				y=(double) _rd.nextInt(43);
				return ;
			default :
				x= new Double(_rd.nextInt(76));
				y= new Double((_rd.nextInt(43)-201));
				return ;
			}
	    }
	    
	    @FXML void NoButton(Event event) {
	    	positionButton();
	    	NoButton.setTranslateX(x);
	    	NoButton.setTranslateY(y);
	    }

	    @FXML
	    void yesButton(Event event) {
	    	Alert _alert = new Alert(AlertType.CONFIRMATION,"Sabía que dírias que sí :3 <3");    	
	    	_alert.showAndWait();
	    	final Node source = (Node) event.getSource();
			final Stage stage = (Stage) source.getScene().getWindow();
			stage.close();	    	
	    }
}
