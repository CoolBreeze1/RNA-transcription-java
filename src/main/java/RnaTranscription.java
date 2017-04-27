

public class RnaTranscription {




    public String ofDna(String dnaString) {
        StringBuilder stringarr = new StringBuilder();
            for (char a : dnaString.toCharArray()){
                switch(a){
                    case 'G':
                        stringarr.append("C");
                        break;
                    case 'C':
                        stringarr.append("G");
                        break;
                    case 'T':
                        stringarr.append("A");
                        break;
                    case 'A':
                        stringarr.append("U");
                        break;
                }
            }
        return stringarr.toString();
    }


}