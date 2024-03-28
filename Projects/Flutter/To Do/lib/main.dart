import 'package:flutter/material.dart';
import 'package:project_todo/pages/homepage.dart';
import 'package:hive_flutter/hive_flutter.dart';

void main() async {
  // initialize the Hive
  await Hive.initFlutter();

  // creating a hive box
  var box = await Hive.openBox("myBox");

  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      home: const HomePage(),
      theme: ThemeData(
        primaryColor: Colors.black,
        textTheme: const TextTheme(
          bodyLarge: TextStyle(color: Colors.white),
        ),
      ),
    );
  }
}
