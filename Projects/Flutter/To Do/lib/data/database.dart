import 'package:hive_flutter/hive_flutter.dart';

class ToDoDatabase {
  // list of todo
  List toDoList = [];

  // referring the Hive Box
  final _myBox = Hive.box("myBox");

  // run this if user opening app for the first time
  void createInitialData() {
    toDoList = [];
  }

  // load the data from the database
  void loadData() {
    toDoList = _myBox.get("TODOLIST");
  }

  // update the database
  void updateDataBase() {
    _myBox.put("TODOLIST", toDoList);
  }
}
