

public ArrayList<String> getValuesFromFile(File file){
    String line;
    StringTokenizer token;
    ArrayList<String> list = null;
    BufferedReader br = null;
    try {
        br = new BufferedReader(new FileReader(file));
        list = new ArrayList<String>();
        while ((line = br.readLine())!=null){
            token = new StringTokenizer(line);
            token.nextToken();
            list.add(token.nextToken());