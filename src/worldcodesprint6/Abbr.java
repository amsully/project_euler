package worldcodesprint6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.stream.Collector;

/**
 * Created by alex on 8/27/16.
 */
public class Abbr {

    public static void main(String[] args) throws Exception
    {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numberOfTimes = Integer.valueOf(br.readLine());

        for(int p = 0; p < numberOfTimes; p++) {
            String mixed = br.readLine();
            String match = br.readLine();
            String upper = mixed.toUpperCase();

            ArrayList<String> mixedLists= new ArrayList<String>();
            ArrayList<String> matchlists = new ArrayList<String>();
            ArrayList<Character> uppers = new ArrayList<Character>();

            String currString = "";
            for(int i = 0; i < mixed.length(); i++)
            {
                char currChar = mixed.charAt(i);

                if(Character.isUpperCase(currChar))
                {
                    // Add to upper
                    uppers.add(currChar);

                    // Finalize Set and List
                    if(currString.length() > 0) {
                        mixedLists.add(currString);
                        currString = "";
                    }

                    // Input index where capital letter is
                    mixedLists.add(currChar +"");

                }else
                {
                    currString += currChar;
                    if(i == mixed.length() -1){
                        mixedLists.add(currString);
                    }
                }
            }

            int matchIndex = 0;

            for(int i = 0; i < mixedLists.size(); i++)
            {
                String listStr = mixedLists.get(i);

                if(listStr.length() > 1 || Character.isLowerCase(listStr.charAt(0))){

                    if(i == mixedLists.size()-1){
                        matchlists.add(match.substring(matchIndex));
                    }

                    continue;
                }else
                {
                    String matchStr = "";
                    Character currChar = listStr.charAt(0);
                    for(int j = matchIndex; j < match.length(); j++)
                    {
                        Character c = match.charAt(j);

                        if(currChar.equals(c))
                        // TODO CHECK FOR LEFT AND RIGHT
                        {
                            // Add new string to be dynamically checked.
                            if(matchStr.length() > 0) {
                                matchlists.add(matchStr);
                                matchStr = "";
                            }

                            // Add placeholder
                            matchlists.add(c + "");

                            // Next time we start at next index. break.
                            matchIndex++;
                            break;

                        }else
                        {
                            matchStr += c;
                            matchIndex++;
                        }

                    }
                }
            }

            if(mixedLists.size() == matchlists.size()){

                String res = "YES";
                for(int i = 0; i < mixedLists.size(); i++){
                    if( !valid(mixedLists.get(i).toUpperCase(), matchlists.get(i))){
                        res = "NO";
                        break;
                    }
                }

                System.out.println(res);

            }else{
                System.out.println("NO");
            }






        }

    }

    private static boolean valid(String upper, String match) {
        int[] prevRow = new int[1 + upper.length()];

        for (int i = 1; i < match.length()+1; i++) {
            int index = i - 1;
            int[] row = new int[1 + upper.length()];

            for (int j = 1; j < upper.length()+1; j++) {
                int jindex = j - 1;

                if (match.charAt(index) == upper.charAt(jindex)) {
                    row[j] = Math.max(1 + prevRow[j - 1], row[j-1]);
                } else {
                    row[j] = Math.max(row[j - 1], prevRow[j]);
                }
            }

            prevRow = row;

        }

        if (prevRow[prevRow.length - 1] == match.length()) {
            return true;
        } else {
            return false;
        }
    }

}
