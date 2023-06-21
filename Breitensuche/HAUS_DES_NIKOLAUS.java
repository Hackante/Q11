
public class HAUS_DES_NIKOLAUS
{
    private Graph graph;

    public HAUS_DES_NIKOLAUS() {
        graph = new Graph(5);

        graph.KnotenEinfuegen("0");
        graph.KnotenEinfuegen("1");
        graph.KnotenEinfuegen("2");
        graph.KnotenEinfuegen("3");
        graph.KnotenEinfuegen("4");

        graph.KanteEinfuegen(0, 1);
        graph.KanteEinfuegen(0, 2);
        graph.KanteEinfuegen(0, 3);
        graph.KanteEinfuegen(0, 4);
        graph.KanteEinfuegen(1, 2);
        graph.KanteEinfuegen(1, 3);
        graph.KanteEinfuegen(1, 4);
        graph.KanteEinfuegen(2, 3);
    }

    public int[] Breitensuche(int start)
    {
        return graph.Breitensuche(start);
    }
}