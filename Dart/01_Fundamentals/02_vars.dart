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
  print("num $num");

  var num2 = 20;
  print("var $num2");

  String name1 = "Dart";
  print("String $name1");

  double newNum = 232.4;
  print("newNum $newNum");

  bool isTrue = true;
  print("isTrue $isTrue");

  dynamic username = 123; // we can change it later
  username = "dartuser1";
  print("Dynamic $username");

}

// everything in Dart is object