import 'dart:html';

import 'package:flutter/material.dart';
import 'package:hive/hive.dart';
import 'package:project_todo/util/show_dialog.dart';
import 'package:project_todo/util/todo_tile.dart';
import 'package:project_todo/data/database.dart';

class HomePage extends StatefulWidget {
  const HomePage({super.key});

  @override
  State<HomePage> createState() => _HomePageState();
}

class _HomePageState extends State<HomePage> {
  // text controller
  final _controller = TextEditingController();

  // list of todo
  // methods to change the checkbox
  void checkBoxChange(bool? value, int index) {
    setState(() {
      db.toDoList[index][1] = !db.toDoList[index][1];
    });
    db.updateDataBase();
  }

  // methods to save the task
  void saveNewTask() {
    setState(() {
      db.toDoList.add([_controller.text, false]);
      _controller.clear();
    });
    Navigator.of(context).pop();
    db.updateDataBase();
  }

  // methods to add new task
  void createNewTask() {
    showDialog(
        context: context,
        builder: (context) {
          return DialogBox(
            myController: _controller,
            onSave: saveNewTask,
            onCancel: () => Navigator.of(context).pop(),
          );
        });
    db.updateDataBase();
  }

  // methods to delete the task
  void deleteTask(int index) {
    setState(() {
      db.toDoList.removeAt(index);
    });
    db.updateDataBase(); 
  }

  // save the task work
  // referring the hive box
  final _myBox = Hive.box("myBox");

  // creating instance of database
  ToDoDatabase db = ToDoDatabase();

  @override
  void initState() {
    // if the user opeing the app for the first time
    if (_myBox.get("TODOLIST") == null) {
      db.createInitialData();
    } else {
      // if data is alreay exist
      db.loadData();
    }
    super.initState();
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
        // backgroundColor: const Color.fromARGB(255, 16, 16, 16),
        backgroundColor: Color.fromARGB(255, 30, 30, 30),
        appBar: AppBar(
          backgroundColor: Colors.black,
          title: const Center(
            child: Text(
              "TO DO",
              style: TextStyle(color: Colors.white),
            ),
          ),
          elevation: 0,
        ),

        // add task button
        floatingActionButton: FloatingActionButton(
          onPressed: createNewTask,
          child: const Icon(Icons.add),
        ),

        // body
        body: ListView.builder(
          itemCount: db.toDoList.length,
          itemBuilder: (context, index) {
            return ToDoTile(
              taskName: db.toDoList[index][0],
              isTaskComplete: db.toDoList[index][1],
              onChanged: (value) => checkBoxChange(value, index),
              deleteFunction: (context) => deleteTask(index),
            );
          },
        ));
  }
}
