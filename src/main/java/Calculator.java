import static java.lang.Integer.parseInt;

public class Calculator {


    public int AddStringDelimeter(String str){
        int sum = 0;
        if(str.isEmpty()){
            return sum;
        }
            String[] subStr;
            String delimiter = "[/,|\n/g]"; // Разделитель
            subStr = str.split(delimiter); // Разделения строки str с помощью метода split()
            for (int i = 0; i < subStr.length; i++) {
                sum+= parseInt(subStr[i]);
            }

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



