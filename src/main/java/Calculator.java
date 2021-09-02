import static java.lang.Integer.parseInt;

public class Calculator {

    public int firstValue;
    public int secondValue;


    public int AddStringDelimeter(String str){
        int sum = 0;
        if(str.isEmpty()){
            return sum;
        }
//            firstValue = 0;
//            secondValue= 0;
//        }else
//        if(str.indexOf(",")>0){
            String[] subStr;
            String delimeter = "[/,|\n/g]"; // Разделитель
            subStr = str.split(delimeter); // Разделения строки str с помощью метода split()
            for (int i = 0; i < subStr.length; i++) {
                sum+= parseInt(subStr[i]);
            }
//            if(subStr.length == 1){
//                firstValue = Integer.parseInt(subStr[0]);
//                secondValue = 0;}
//            else {
//                firstValue = Integer.parseInt(subStr[0]);
//                secondValue = Integer.parseInt(subStr[1]);
//            }
//
//        }else{
//            firstValue = Integer.parseInt(str);
//            secondValue = 0;

            return sum;





    }
//        public int addition(String values){
//          //  StringDelimeter(values);
//            return firstValue+secondValue;
//        }
//
//        public int subtraction(String values){
//
//            return 0;
//        }
//
//        public int multiplication(String values){
//
//            return 0;
//        }
//
//
//        public int division(String values){
//            return 0;
//        }



    }



