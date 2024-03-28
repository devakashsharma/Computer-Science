import 'package:flutter/material.dart';
import 'package:project_todo/util/buttons.dart';

// ignore: must_be_immutable
class DialogBox extends StatelessWidget {
  // ignore: prefer_typing_uninitialized_variables
  final myController;
  VoidCallback onSave;
  VoidCallback onCancel;

  DialogBox({
    super.key, 
    required this.myController,
    required this.onSave,
    required this.onCancel,
  });

  @override
  Widget build(BuildContext context) {
    return AlertDialog(
      backgroundColor: Color.fromARGB(255, 33, 33, 33),
      content: Container(
        height: 120,
        child:
            Column(mainAxisAlignment: MainAxisAlignment.spaceEvenly, children: [
          // get users input
          TextField(
            controller: myController,
            // style: TextStyle(
            //   color: Colors.white,
            // ),
            decoration: InputDecoration(
                border: OutlineInputBorder(),
                hintText: "Add task",
                hintStyle: TextStyle(
                  color: Colors.white,
                )),
          ),

          // button
          Row(
            mainAxisAlignment: MainAxisAlignment.spaceEvenly,
            children: [
              // save button
              MyButton(text: "Save", onPressed: onSave),

              // cancel button
              MyButton(text: "Cancel", onPressed: onCancel),
            ],
          )
        ]),
      ),
    );
  }
}
