package controllers.category.helpers;

import services.CategoryService;
import interfaces.PaginationHandlerController;
import entities.Category;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import utils.builders.CategoryTableBuilder;
import utils.builders.CategoryTypeBadgeCellRenderer;
import utils.builders.StatusBadgeCellRenderer;
import utils.enums.SearchCriteriaEnum;
import views.warehouse.WarehouseCategories;

public class CategoryPagination extends PaginationHandlerController<Category, WarehouseCategories, CategoryService> {

    public CategoryPagination(WarehouseCategories view, CategoryService service) {
        super(view, service);
    }

    @Override
    protected int getPageComboBoxItemCount() {
        return view.pageCombo.getItemCount();
    }
    
    @Override
    protected int getTotalItems() {
        return service.getTotal();
    }

    @Override
    protected int getSelectedItemsPerPage() {
        return Integer.parseInt(view.itemsPerPageComboBox.getSelectedItem().toString());
    }

    @Override
    protected int getSelectedPage() {
        Object selectedItem = view.pageCombo.getSelectedItem();
        if (selectedItem == null) {
            return 1;
        }
        return Integer.parseInt(selectedItem.toString());
    }

    @Override
    protected void clearPageComboBox() {
        view.pageCombo.removeAllItems();
    }

    @Override
    protected void addPageToComboBox(int pageNumber) {
        view.pageCombo.addItem(pageNumber + "");
    }

    @Override
    protected void setSelectedPageIndex(int index) {
        view.pageCombo.setSelectedIndex(index);
    }

    @Override
    protected List<Category> listItemsByPage(String filter, SearchCriteriaEnum criteria, int page, int perPage) {
        return service.listByPage(filter, criteria, page, perPage);
    }

    @Override
    protected DefaultTableModel buildTableModel(List<Category> items) {
        return CategoryTableBuilder.create(items);
    }

    @Override
    protected void setTableModel(DefaultTableModel model) {
        view.categoriesTable.setModel(model);
        view.categoriesTable.getColumnModel().getColumn(6).setCellRenderer(new StatusBadgeCellRenderer());
        view.categoriesTable.getColumnModel().getColumn(3).setCellRenderer(new CategoryTypeBadgeCellRenderer());

    }

    @Override
    protected void setRowSorter(TableRowSorter<DefaultTableModel> sorter) {
        view.categoriesTable.setRowSorter(sorter);
    }

    @Override
    protected void showQuantityLabel(int showing, int total) {
        view.quantityItems.setText("Visualizando " + showing + " de " + total + " categorias");
    }

}