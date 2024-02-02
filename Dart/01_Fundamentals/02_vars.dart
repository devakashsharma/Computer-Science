import 'dart:io';

main () {
  stdout.writeln("What is your name");
  String? name = stdin.readLineSync();
  print("Your name is $name");

  // Comments
  /*
  // In line comments

  /*
  MultiLine
  Comments
  */

  /// Docummentation
  */

  // Data Type
  int num = 21;
  var num2 = 20;

  String name1 = "Dart";

  double newNum = 232.4;

  bool isTrue = true;

  dynamic username = 123; // we can change it later
  username = "dartuser1";

}

// everything in Dart is object