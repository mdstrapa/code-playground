public class AppTurnName {

    public String turnName(String originalName){
        StringBuilder newName = new StringBuilder();

        originalName = originalName.toLowerCase();

        for(char c : originalName.toCharArray()){

            switch (c){
                case 'f': newName.append("ph");
                break;
                case 'l': newName.append("ll");
                break;
                case 'i' : newName.append("y");
                break;
                case 'e' : newName.append("eh");
                break;
                case 'o' : newName.append("oh");
                break;
                case 'v' : newName.append("w");
                break;
                case 'c' : newName.append("k");
                break;
                default: newName.append(c);
            }
        }


        //TODO: turn the first character into upper case
        //TODO: the vowels should have 'h' only if it ends the name
        //TODO: create some user interface
        return newName.toString();
    }


}
