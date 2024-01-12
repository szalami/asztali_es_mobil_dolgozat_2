/*
* File: TodoService.java
* Author: Faragó Csaba
* Copyright: 2024, Faragó Csaba
* Group: Szoft II_1_E
* Date: 2024-01-12
* Github: https://github.com/szalami/asztali_es_mobil_dolgozat_2.git
* Licenc: GNU GPL
*/

import hu.szit.Client;

public class TodoService {
    String url;
    Client client;

    public TodoService() {
        url = "https://jsonplaceholder.typicode.com/todos";
        client = new Client();
    }

    public String getTodos() {
        return client.get(url);
    }
}