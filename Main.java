class Main {
  public static void main(String[] args) {
    System.out.println("M&M Color Counts");
    int totalCandy = 55 * 10;
    System.out.println("On Average Total Candy is " + totalCandy);

    double blueCandy = totalCandy * .24;
    System.out.println("Blue: " + blueCandy);

    double brownCandy = totalCandy * .13;
    System.out.println("Brown: " + brownCandy);

    double greenCandy = totalCandy * .16;
    System.out.println("Green: " + greenCandy);

    double orangeCandy = totalCandy * .20;
    System.out.println("Orange: " + orangeCandy);

    double redCandy = totalCandy * .13;
    System.out.println("Red: " + redCandy);

    double yellowCandy = totalCandy * .14;
    System.out.println("Yellow: " + yellowCandy);

    double grandTotalCandy = blueCandy + brownCandy + greenCandy + orangeCandy + redCandy + yellowCandy;
    System.out.println("sum: " + grandTotalCandy);

    if (blueCandy > brownCandy && greenCandy > orangeCandy);
       System.out.println("Blue over Brown and Green over Orange "+ (blueCandy > brownCandy && greenCandy > orangeCandy));

    if (brownCandy <=  redCandy)
     System.out.println("Brown is less than or equal to Red " + (brownCandy <=  redCandy));

     if ( grandTotalCandy == totalCandy)
     System.out.println("Numbers match "+ (grandTotalCandy == totalCandy));

  }
}