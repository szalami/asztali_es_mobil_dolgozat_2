/*
* File: Helper.java
* Author: Faragó Csaba
* Copyright: 2024, Faragó Csaba
* Group: Szoft II_1_E
* Date: 2024-01-12
* Github: https://github.com/szalami/asztali_es_mobil_dolgozat_2.git
* Licenc: GNU GPL
*/

import java.util.ArrayList;

import hu.szit.Convert;

public class Helper {
    TodoService todoservice;

    public Helper() {
        todoservice = new TodoService();
        getTodos();
    }

    public void getTodos() {
        String todos = todoservice.getTodos();
        ArrayList<Todo> todolist = Convert.toListObject(todos, Todo.class);
        for (Todo todo : todolist) {
            System.out.println(
                    "userId: " + todo.userId + " | id: " + todo.id + " | title: " + todo.title + " | completed: "
                            + todo.completed);
        }
    }

}