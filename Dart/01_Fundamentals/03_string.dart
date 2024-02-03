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
  var rawString = r"Hey there \nThis is raw string";
  print(rawString);

  // Multi line string
  var multi = '''
    Hey There
    Its me
    Dart user
    ''';

  var newMulti = """
    Hey There
    Its me
    Dart user
    """;




}
