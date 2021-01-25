package Clase_Mañana;

public class Contador {

    private int count;

    public void SetCount(int value){
        this.count = value;
    }

    public int GetCount() {
        return count;
    }

    public Contador(int count) {
        SetCount(count);
    }

    public Contador(Contador objCount){
        SetCount(objCount.count);
    }

    public void Incrementar(int value){
        int total = GetCount() + value;
        SetCount(total);
    }

    public void Decrementar(int value){
        int total = GetCount() - value;
        SetCount(total);
    }
}
