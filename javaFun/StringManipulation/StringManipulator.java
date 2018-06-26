public class StringManipulator{
    public String trimAndConCat(String str1, String str2){
        String trim1 = str1.trim();
        String trim2 = str2.trim();
        String result = trim1.concat(trim2);
        return result;
    }
    public Integer getIndexOrNull(String mystr, char myletter){
        Integer result = mystr.indexOf(myletter);
        return result;
    }
    public Integer getIndexOrNull(String bigstr, String partstr){
        Integer result2 = bigstr.indexOf(partstr);
        return result2;
    }
    public String concatSubString(String substr, int startidx, int endidx, String mainstr){
        String mysubstr = substr.substring(startidx, endidx);
        String result3 = mysubstr.concat(mainstr);
        return result3;
    }
}