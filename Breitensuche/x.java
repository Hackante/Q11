public String[] Breitensuche(int startIndex) {
    boolean[] besucht = new boolean[anzahlKnoten];
    ArrayList<Integer> queue = new ArrayList<Integer>();
    String[] ergebnis = new String[anzahlKnoten];
    int iteration = 0;
    queue.add(startIndex);
    besucht[startIndex] = true;
    while(!queue.isEmpty()) {
        int aktuellerKnoten = queue.remove(0);
        ergebnis[iteraction] = KnotenBezeichnerGeben(aktuellerKnoten);
        System.out.println("Knoten " + KnotenBezeichnerGeben(aktuellerKnoten) + " besucht");
        for (int i = 0; i < anzahlKnoten; i++) {
            if(matrix[aktuellerKnoten][i] > 0 && !besucht[i]) {
                queue.add(i);
                besucht[i] = true;
            }
        }
        iteration++;
    }
    return ergebnis;
}
