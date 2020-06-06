package tema;

import java.util.ArrayList;
import java.util.List;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("persons")
public class TestView extends VerticalLayout{
	public TestView() {
		Grid<Person> grid = new Grid<Person>();
		List<Person> persons = new ArrayList<Person>();
		persons.add(new Person("Таня",8));
		persons.add(new Person("Кирилл",8));
		persons.add(new Person("Данила",8));

		Grid<Person> дурачки = new Grid<Person>();
		List<Person> списокдурачков = new ArrayList<Person>();
		списокдурачков.add(new Person("Василий",3));
		списокдурачков.add(new Person("Евстафий",25));
		списокдурачков.add(new Person("Ярик",8));
		дурачки.setItems(списокдурачков);
		
		grid.addColumn(Person::getName).setHeader("Друг");
		grid.addColumn(Person::getAge).setHeader("Возраст");
		
		дурачки.addColumn(Person::getName).setHeader("Дурачок");
		дурачки.addColumn(Person::getAge).setHeader("Возраст");
		
		grid.setItems(persons);
		
		add(
			new H2("Друзья"),
			grid,
			new H2("Дурачки"),
			дурачки
		);
	}
}
