public class AppBackwardsName {

    public String backwardName(String originalName){

        StringBuilder backwardName = new StringBuilder();

        String[] names = originalName.split(" ");

        for(int n = names.length - 1;n>=0;n--){
            String name = names[n].toLowerCase();
            for(int c = name.length() - 1;c>=0;c--){
                if(c == name.length() - 1) backwardName.append(String.valueOf(name.charAt(c)).toUpperCase());
                else backwardName.append(name.charAt(c));
            }
            backwardName.append(" ");
        }

        return backwardName.toString().trim();
    }

}
