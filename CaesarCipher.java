public class CaesarCipher{
    public static String cipher(String message, int offset){
        StringBuilder result = new StringBuilder();
        for (char character : message.toCharArray()) {
            if (character != ' ') {
            int originalAlphabetPosition = character - 'a';
            int newAlphabetPosition = (originalAlphabetPosition + offset) % 26;
            char newCharacter = (char) ('a' + newAlphabetPosition);
            result.append(newCharacter);
            } 
            else {
                result.append(character);
            }
        }
        return result.toString();
    }

    public static String decipher(String message, int offset){
        return cipher(message, (26 - offset) % 26); 
    }

    public static void main(String[] args){
        String text = "This is a ciphered message for example of this class"; 
        System.out.println(text); 

        String cipheredMessage = cipher(text, 4); 
        System.out.println(cipheredMessage); 

        // String jumbledText = "ro dyvn wo s myevn xofob dokmr k vvkwk dy nbsfo"; 
        String decipheredMessage = decipher(cipheredMessage, 4); 
        System.out.println(decipheredMessage); 
    }
}