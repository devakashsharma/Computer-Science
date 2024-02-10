void main() {
  // Strings
  var v1 = 'v1';
  var v2 = "v2";
  var v3 = 'it\'s';
  var v4 = "it's";

  print(v1);
  print(v2);
  print(v3);
  print(v4);

  // Raw string
  /// if we want to use special characters in a string such as \n then we need to use 'r'before the strings value
  var rawString = r"Hey there \n This is raw string";
  print(rawString);

  // Multi line string
  var multi = '''
    Hey There
    Its me
    Dart user
    ''';
    print(multi);

  var newMulti = """
    Hey There
    Its me
    Dart user
    """;
    print(newMulti);

  // String interpolation
  var strAge = 20;
  var strName = "STR";
  print("The name is $strName and age is $strAge");

  // Type conversion

  // str -> int
  var int1 = int.parse("12");
  assert(int1 == 12); // it will check if it is converted or not

  // int -> double
  var int2 = double.parse("12.5");
  assert(int2 == 12.5);

  // int -> str
  String ms = int1.toString();
  print(ms);

  // Typeof data type
  print(ms.runtimeType); // it will check the data type




}
