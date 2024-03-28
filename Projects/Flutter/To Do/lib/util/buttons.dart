import 'package:flutter/material.dart';

// ignore: must_be_immutable
class MyButton extends StatelessWidget {
  final String text;
  VoidCallback onPressed;

  MyButton({
    super.key,
    required this.text,
    required this.onPressed,
  });

  @override
  Widget build(BuildContext context) {
    return MaterialButton(
      onPressed: onPressed, 
      // color: Theme.of(context).primaryColor,
      color: const Color.fromARGB(255, 11, 11, 11),
      child: Text(
        text,
        style: const TextStyle(
          color: Colors.white,
        ),
      ),
    );
  }
}
