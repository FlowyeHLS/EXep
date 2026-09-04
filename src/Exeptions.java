
void main()
{
    Scanner console = new Scanner(System.in);
//    System.out.println("Type first num: ");
//    int firstNum = console.nextInt();
//    System.out.println("Type second num: ");
//    int secondNum = console.nextInt();
//    int treteeNum = firstNum / secondNum;
//    try
//    {
//        System.out.println(treteeNum);
//    }
//    catch (ArithmeticException e)
//    {
//        System.out.println("Na 0 can't delite");
//    }


//    int num = 0;
//    boolean poka = false;
//    while (!poka)
//    {
//        System.out.println("Type something: ");
//        String string = console.nextLine();
//
//        try
//        {
//            num = Integer.parseInt(string);
//            poka = true;
//        }
//        catch (NumberFormatException e)
//        {
//            System.out.println("oshibka");
//        }
//    }
//    System.out.println("Ur type: " + num);

    int[] arr = new int[5];
    Random random = new Random();

    for (int i = 0; i < arr.length; i++)
    {
        arr[i] = random.nextInt(50);
    }

    System.out.println("Type index(0-4): ");
    int index = console.nextInt();

    System.out.println("type chslo dly delen: ");
    int deletel = console.nextInt();
    try
    {
        int value = arr[index];
        int result = value / deletel;
        System.out.println("result: " + result);
    }
    catch (ArrayIndexOutOfBoundsException e)
    {
        System.out.println("Zashel za granici");
    }
    catch (ArithmeticException ee)
    {
        System.out.println("Delet na 0 nemozho");
    }
    finally
    {
        System.out.println("Vse zakoncheno");
    }



}