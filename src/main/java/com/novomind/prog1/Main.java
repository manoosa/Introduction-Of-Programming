package com.novomind.base64;

public class Main {

  public static void main(String[] args) {

    String currentDir = "D:/Base64EncoderDecoder/src/main/resources/";
//     Base64EncoderDecoder.encodeXslxFile(currentDir + "decodedStringFile.xlsx", currentDir +
//     "encodedStringFile2.txt");
    Base64EncoderDecoder
      .decodeStringAndExportXslxFile(currentDir + "encodedStringFile.txt",
                                     currentDir + "decodedStringFile.csv");

  }
}
