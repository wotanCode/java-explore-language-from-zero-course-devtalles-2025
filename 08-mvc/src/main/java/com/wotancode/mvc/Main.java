package com.wotancode.mvc;

import com.wotancode.mvc.task.controller.TaskController;
import com.wotancode.mvc.task.model.TaskRepository;
import com.wotancode.mvc.task.view.TaskView;

public class Main {
    public static void main(String[] args) {

        TaskRepository repository = new TaskRepository();
        TaskController controller = new TaskController(repository);
        TaskView view = new TaskView(controller);

        view.showMenu();

    }
}