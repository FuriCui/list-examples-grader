class ListExamples{
    static List<String> filter(List<String> s, StringChecker sc){
        List<String> result = new ArrayList<>();
        for(String s: list) {
            if(sc.checkString(s)) {
                result.add(s);
      }
    }
    return result;
}
    static List<String> merge(List<String> list1, List<String> list2){
        List<String> result = new ArrayList<>();
        int num1 = 0, int num2 = 0;
        while(num1 < list1.size() && num2 < list2.size()) {
            if(list1.get(num1).compareTo(list2.get(num2)) < 0) {
                result.add(list1.get(num1));
                num1 += 1;
            }
            else {
                result.add(list2.get(num2));
                num2 += 1;
            }
        }
        while(num1 < list1.size()) {
            result.add(list1.get(num1));
            num1 += 1;
        }
        while(num2 < list2.size()) {
            result.add(list2.get(num2));
            num2 += 1;
        }
        return result;
    }
}