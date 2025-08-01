package views.warehouse;

import javax.swing.WindowConstants;
import utils.constants.ViewConstants;
import views.components.Button;
import views.components.ImageCustom;
import views.components.Input;

public class WarehouseEditCategoryInit {
    
    private final WarehouseEditCategory view;
    private final Button buttonGenerator = new Button();
    private final Input input = new Input();
    private final ImageCustom image = new ImageCustom();
    
    public WarehouseEditCategoryInit(WarehouseEditCategory view) {
        this.view = view;
    }
    
    public void init() {
        
        view.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        view.setResizable(false);
        
        buttonGenerator.solidButton(view.btnEditCategory, ViewConstants.skyColor, "#FFFFFF", 12);
        buttonGenerator.addIcon(view.btnEditCategory, "icon-save", 20);
        buttonGenerator.outlineButton(view.btnCancelEditCategory, ViewConstants.errorColor, ViewConstants.errorColor);
        buttonGenerator.addIcon(view.btnCancelEditCategory, "icon-left-red", 20);
        
        input.roundedField(view.categoryNameTxt, "#DDDDDD", 10, "Ingresa un nombre de categoría");
        input.roundedComboBox(view.categoryTypeCombo, "#DDDDDD", 10);
        input.roundedArea(view.categoryDescTxt, "#DDDDDD", 10);
        
        image.addImage(view.iconInputMandatory, "icon-lock", 16);
        image.addImage(view.iconInputMandatory2, "icon-lock", 16);
        image.addImageFix(view.iconRH, "logo-rh", 50, 50);
        
    }
    
}
