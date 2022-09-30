package suanshi;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.regex.Pattern;

public class jisuan {
    String result1 ;
        public String test1 (String s1) throws ScriptException {
            ScriptEngineManager manager = new ScriptEngineManager();
            ScriptEngine se = manager.getEngineByName("js");

             result1 = se.eval(s1).toString();//转换成字符串


            StringCheck trans = new StringCheck();
            Double T = trans. transformStringToDecimal(result1);

            Fraction F = new Fraction();
            int[] fraction = F.toFractionPos(T);
            if (fraction[1]==1){

                result1 =String.valueOf(fraction[0]);
            }else {
                result1 = (fraction[0] + "/" + fraction[1]);
            }

        return result1;
        }

    public static class StringCheck {

        public enum FormatType{
            INTEGER, // "^(\\+|-)?[1-9]\\d*|0$"
            DECIMALS // "^((-|\\+)?(([1-9]\\d*)|0)(\\.\\d*)?)|0$"
        }
        //字符串长度检查
        public static boolean StringLengthInRange(String str, Integer minLength, Integer maxLength){
            byte bytes[] = str.getBytes();
            return (minLength <= bytes.length && bytes.length <= maxLength );
        }
        //整数字符串格式检查
        public static boolean StringIsInteger(String str){
            return Pattern.matches("^(\\+|-)?[1-9]\\d*|0$", str);
        }
        //小数字符串格式检查
        public static boolean StringIsDecimals(String str){
            return Pattern.matches("^((-|\\+)?(([1-9]\\d*)|0)(\\.\\d*)?)|0$", str);
        }
        /*
        //将字符串转换为Integer
        public static Integer transformStringToInteger(String string){
            Integer result = null;
            if(StringIsInteger(string)){
                result = Integer.parseInt(string);
            }
            return result;
        }
        //将字符串转换为Long
        public static Long transformStringToLong(String string){
            Long result = null;
            if(StringIsInteger(string)){
                result = Long.parseLong(string);
            }
            return result;
        }*/
        //将字符串转换为Double
        public static Double transformStringToDecimal(String string){
            Double result = null;
            if(StringIsDecimals(string)){
                result = Double.parseDouble(string);
            }
            return result;
        }
    }

}



