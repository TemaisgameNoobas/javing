package tema;




import java.util.ArrayList;
import java.util.List;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.listbox.ListBox;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route("")
public class MainView  extends VerticalLayout{
	public MainView() {
		Button b_add = new Button("Добавить",VaadinIcon.PLUS.create());
		TextField f_name = new TextField();
		ListBox<String> l_friends = new ListBox<>();
		Grid<Person> grid = new Grid<Person>();
		List<Person> persons = new ArrayList<Person>();
		persons.add(new Person("Артем",8));
		
		grid.addColumn(Person::getName);
		grid.addColumn(Person::getAge);
		
		grid.setItems(persons);
		
		b_add.addClickListener(listener->{
			l_friends.add(new Label(f_name.getValue()));
			f_name.setValue("");
		});
		add(
			new HorizontalLayout(f_name,b_add),
			l_friends,
			grid
		);
	}
}
