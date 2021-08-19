

    public class Calculator {

    public int firstValue;
    public int secondValue;


    public void StringDelimeter(String str){
        if(str.isEmpty()){
            firstValue = 0;
            secondValue= 0;
        }else
        if(str.indexOf(",")>0){
            String[] subStr;
            String delimeter = ","; // Разделитель
            subStr = str.split(delimeter); // Разделения строки str с помощью метода split()
            if(subStr.length == 1){
                firstValue = Integer.parseInt(subStr[0]);
                secondValue = 0;}
            else {
                firstValue = Integer.parseInt(subStr[0]);
                secondValue = Integer.parseInt(subStr[1]);
            }

        }else{
            firstValue = Integer.parseInt(str);
            secondValue = 0;
        }




    }
        public int addition(String values){
            StringDelimeter(values);
            return firstValue+secondValue;
        }

        public int subtraction(String values){

            return 0;
        }

        public int multiplication(String values){

            return 0;
        }


        public int division(String values){
            return 0;
        }



    }



