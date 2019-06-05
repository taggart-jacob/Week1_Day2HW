# Week1_Day2HW
1. Duplicate Strings
Create a function to print the duplicates in a list of strings
Solution method:

    public static void findDuplicates(List<String> words) {
      List<String> duplicates = new ArrayList<>();
      //for loop to run through the first value to the final value
      for (int i = 0; i < words.size(); i++) {
                    //another for loop to ensure that the outer loop's counter sticks at the first value when comparing the inner loop's value
                    for (int n = i+1; n < words.size(); n++) {
                        //if the first word equals the next word incremented one at a time
                        if (words.get(i).equals(words.get(n))) {
                            //if there are multiple iterations of the duplicate word
                            if (duplicates.contains(words.get(i))) {
                                //then the inner for loop breaks
                                break;
                                //otherwise,
                            } else {
                                //gets the word that is a duplicate (no matter how many times) and stores it to a string
                                String s = words.get(i);
                                duplicates.add(s);
                            }
                        }
                    }
                }
                //prints out the starting phrase
                System.out.println("All duplicate words:");
                //for each element of the duplicates array
                for (String a: duplicates){
                    //prints out the element and goes to another line
                    System.out.println(a);
                }
            }
Screenshot: ![Week1Day2_duplicateStrings](https://user-images.githubusercontent.com/51377398/58973063-0d9c5b00-878d-11e9-9529-6caef848939f.png)

2. Palindromes
Create function to check if the string is a palindrome without using string.reverse() method
Solution method:
    
    
    //checkPalindrome() method
    public static boolean checkPalindrome(String word) {
        //converts the string argument into a charArray
        char[] charArray = word.toCharArray();
        //declares/initializes a new empty charArray set to the same memory space as the other charArray
        char[] charArray2 = new char[charArray.length];
        //for loop to run through the elements of the first charArray and set each element to the other charArray's opposite position
        for (int i = 0; i < charArray.length; i++){
            //this equation flips the first charArray around and assigns it to the empty charArray
            charArray2[charArray2.length - (i+1)] = charArray[i];
        }
        //if the first charArray is equal to itself backwards (charArray2), then
        if (Arrays.equals(charArray, charArray2)){
            //returns as true
            return true;
            //else
        } else {
            //return false
            return false;
        }
    }
Screenshot:
![Week1Day2_Palindrome](https://user-images.githubusercontent.com/51377398/58973064-0e34f180-878d-11e9-98fa-ac481ed98a8c.png)

3. Divisibles
Create a function that will print:
"fizz" is the number is divisible by 3
"buzz" is the number is divisible by 5
"fizzbuzz" is the number is divisible by both
Solution method:
    //checkDivisibility method to print words based on divisiblity
    public static void checkDivisibility(int num){
        //if there's no remainder when divided by 3 and when divided by 5
        if ((num % 3 == 0) && (num % 5 == 0)){
            //print out "fizzbuzz"
            System.out.println("fizzbuzz");
        }
        //if there's no remainder when divided by 3 but there is when divided by 5
        if ((num % 3 == 0) && (num % 5 != 0)){
            //print out "fizz"
            System.out.println("fizz");
        }
        //if there's no remainder when divided by 5 but there is a remainder when divided by 3
        if ((num % 3 != 0) && (num % 5 == 0)){
            //print "buzz"
            System.out.println("buzz");
        }
        //if there's a remainder when divided by both 5 and 3
        if ((num % 3 !=0) && (num % 5 != 0)){
            //prints out that neither number is divisible by 3 or 5
            System.out.println("This number is not divisible by 3 or 5");
        }
    }
Screenshot:
![Week1Day2_Divisibles](https://user-images.githubusercontent.com/51377398/58973065-0e34f180-878d-11e9-98df-7780c855f10e.png)

4. Anagrams
Create a function to check if the two strings are Anagrams: Eg COAT and TACO would be anagrams
Solution method: 
    //checks to ensure the two arguments are or are not anagrams
    public static boolean checkAnagrams(String word1, String word2){
        //converts both arguments to charArray
        char[] charArray = word1.toCharArray();
        char[] charArray2 = word2.toCharArray();
        //sorts charArrays to make the first element the lowest alphabetical value (i.e. "a", "b", "c"...")
        Arrays.sort(charArray);
        Arrays.sort(charArray2);
        //after sorted, if the lengths are equal and the arrays are equivalent to each other
        if ((charArray.length == charArray2.length) && (Arrays.equals(charArray, charArray2))){
            //return true
            return true;
        }   else {
            //false
            return false;
        }
    }
Screenshot:
![Week1Day2_Anagrams](https://user-images.githubusercontent.com/51377398/58973374-ce223e80-878d-11e9-9a24-5f8481b281b5.png)

5. Multiplication Table:
Print a multiplication table from 1 to 10 using multidimensional array. 
Solution method:
    //printTables() creates a multiplication table from 1-10
    public static void printTables(){
        //declares a 10x10 table via a multidimensional array
        int[][] mult = new int[10][10];
        //outer for loop to deal with rows
        for (int i = 0; i < 10; i++){
            //inner for loop to deal with columns
            for (int j = 0; j < 10; j++){
                //equation to ensure each spot populated provides a correct value
                mult[i][j] = (i+1) * (j + 1);
                //Formats the array as a string and outputs it
                System.out.printf("%s", mult[i][j]);
            }
            //creates a new line for the next row's values
            System.out.println();
        }
    }
Screenshot:
![Week1Day2_MultTable](https://user-images.githubusercontent.com/51377398/58973062-0d9c5b00-878d-11e9-899a-095b127b0b8c.png)
