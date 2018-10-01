// THIS IS DENNIS' FAULT!!!

public class StringDemo {
    
    public static void main (String[] args) {
        
        String name = " Dennis"; // NO DAN WANGING ALLOWED!
        System.out.println("name = " + name); // Dennis
        
        // charAt will return the character in the specified INDEX
        System.out.println(name.charAt(2)); // ??????? e?
        System.out.println(name.charAt(0)); // ??????? D?
        
        System.out.println();
        
        // toUpperCase will return the string IN ALL UPPERCASE
        System.out.println(name.toUpperCase()); // DENNIS
        
        // toLowerCase will return the string *in all lowercase*
        System.out.println(name.toLowerCase()); // dennis
        
        System.out.println();
        
        // length() returns the actual length of the String
        System.out.println(name.length()); // ???? 5? 6?
        
        System.out.println();
        
        // substring(inclusive, exclusive) will start and end at the two positions
        System.out.println(name.substring(1, 3)); // ???? en
    
        // substring(justOneNumber) will start at the number and go to the end
        System.out.println(name.substring(2)); // nnis
        
        // A Boy and his Blob
        // http://static.tvtropes.org/pmwiki/pub/images/303000477_a0bc77ef7d.jpg
        
        // trim() will ... eradicate leading and trailing whitespace
        System.out.println(name.trim());
        
        System.out.println();
        
        // reassign the value of 'name' with the = operator (ASSIGN)
        name = name.toUpperCase();
        
        System.out.println(name);
        
        System.out.println();
        
        // indexOf(character) returns the first index of that character
        System.out.println(name.indexOf('I')); // 4
        System.out.println(name.indexOf('N')); // 2
        System.out.println(name.indexOf('Z')); // -1
        
        System.out.println();
        
        // indexOf(String) returns the first index of the String in the String
        System.out.println(name.indexOf("NIS")); // 3
        
        System.out.println();
        
        String name2 = "Dennis ";
        System.out.println(name.equals(name2));
        System.out.println(name.equalsIgnoreCase(name2));
        System.out.println(name.trim().equalsIgnoreCase(name2.trim()));
        
        
        
        
        
        
        
        
        
        
        
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }
    
}










