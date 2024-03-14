package neetcode.arrays_n_strings;

import java.util.HashSet;
import java.util.Set;

public class Unique_Email_Addresses {
    public static void main(String[] args) {
        String[] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        System.out.println(numUniqueEmails(emails));
    }

    public static int numUniqueEmails(String[] emails) {
        Set<String> s = new HashSet<>();
        for (int i = 0; i < emails.length; i++) {
            String[] email = emails[i].split("@");
            //split(".") and check in the second part, if the length is more than 1 then it's invalid
            String local = email[0];
            String domain = email[1];
                String[] splittedByPlus = local.split("\\+");
                String validatedLocal = splittedByPlus[0].replace(".", "");
                s.add(validatedLocal+"@"+domain);
        }
        return s.size();
    }



}
