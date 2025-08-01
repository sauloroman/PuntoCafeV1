package views.warehouse;

import javax.swing.WindowConstants;
import utils.constants.ViewConstants;
import views.components.Button;
import views.components.ImageCustom;
import views.components.Input;

public class WarehouseCreateDishInit {
    
    private final WarehouseCreateDish view;
    private final String INPUT_COLOR = "#DDDDDD";
    private final Button buttonGenerator = new Button(); 
    private final ImageCustom imageGenerator = new ImageCustom();
    private final Input inputGenerator = new Input();

    public WarehouseCreateDishInit(WarehouseCreateDish view) {
        this.view = view;
    }
    
    public void init() {
        view.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        view.setResizable(false);
        
        buttonGenerator.solidButton(view.btnSaveDish, ViewConstants.skyColor, "#ffffff", 11);
        buttonGenerator.addIcon(view.btnSaveDish, "icon-save", 20);
        buttonGenerator.outlineButton(view.btnCancelSaveDish, ViewConstants.errorColor, ViewConstants.errorColor);
        buttonGenerator.addIcon(view.btnCancelSaveDish, "icon-left-red", 20);
        buttonGenerator.outlineButton(view.btnLoadImage, INPUT_COLOR, ViewConstants.textBtn);
        buttonGenerator.addIcon(view.btnLoadImage, "icon-up", 20);
        buttonGenerator.outlineButton(view.btnRemoveImage, INPUT_COLOR, ViewConstants.textBtn);
        buttonGenerator.addIcon(view.btnRemoveImage, "icon-down", 20);
        
        inputGenerator.roundedField(view.dishNameTxt, INPUT_COLOR, 10, "Ingresa el nombre del platillo");
        inputGenerator.roundedComboBox(view.dishCategoryCombo, INPUT_COLOR, 10);
        inputGenerator.roundedArea(view.dishDescriptionTxt, INPUT_COLOR, 10);
        inputGenerator.roundedField(view.dishPriceTxt, INPUT_COLOR, 10, "");
        
        imageGenerator.addImageFix(view.iconRH, "logo-rh", 50, 50);
        imageGenerator.addImageProduct(view.dishImageLabel, "no-image.jpg", 200, 200);
        imageGenerator.addImage(view.iconMandatory, "icon-lock", 14);
        imageGenerator.addImage(view.iconMandatory2, "icon-lock", 14);
        imageGenerator.addImage(view.iconMandatory4, "icon-lock", 14);
    }
    
}
