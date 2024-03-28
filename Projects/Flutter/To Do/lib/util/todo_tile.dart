import 'package:flutter/material.dart';
import 'package:flutter_slidable/flutter_slidable.dart';

// ignore: must_be_immutable
class ToDoTile extends StatelessWidget {
  final String taskName;
  final bool isTaskComplete;
  Function(bool?)? onChanged;
  Function(BuildContext)? deleteFunction;

  ToDoTile(
    {
      super.key,
      required this.taskName,
      required this.isTaskComplete,
      required this.onChanged,
      required this.deleteFunction,
    }
  );

  @override
  Widget build(BuildContext context) {
    return Padding(
      padding: const EdgeInsets.only(left: 18, right: 18, top: 18),
      child: Slidable(
        endActionPane: ActionPane(
          motion: StretchMotion(),
          children: [
            SlidableAction(
              onPressed: deleteFunction,
              icon: Icons.delete,
              backgroundColor: Colors.red.shade300,
              borderRadius: BorderRadius.circular(11),
            ),
          ],
        ),

        child: Container(
          padding: const EdgeInsets.all(18),
          decoration: BoxDecoration(
              color: Colors.black, borderRadius: BorderRadius.circular(11)),
          child: Row(
            children: [
              Checkbox(
                value: isTaskComplete,
                onChanged: onChanged,
                // fillColor: MaterialStateColor.resolveWith((states) => Colors.black),
                activeColor: Colors.black,
              ),
              Container(
                child: Text(
                  taskName,
                  style: TextStyle(
                    color: Colors.white,
                    decoration: isTaskComplete
                        ? TextDecoration.lineThrough
                        : TextDecoration.none,
                    decorationThickness: isTaskComplete ? 3.0 : 0.0,
                  ),
                ),
              ),
            ],
          ),
        ),
      ),
    );
  }
}
