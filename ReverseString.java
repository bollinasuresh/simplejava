public class ReverseString {

          public static void main(String[] args) {
                  
                   String str = "CodingInterview";
                   StringBuilder str2 = new StringBuilder();
                   str2.append(str);
                   str2 = str2.reverse();    
                   System.out.println(str2);
          }

}