package Modulo17.generic.ExeGeneric;

public class ExGenericEntry {
    public static void main(String[] args) {
        GenericEntry<String, Long> entry = new GenericEntry<String, Long>("Teste GenericEntry", 18l);
        System.out.println(entry.getData()+ " " + entry.getCodigo());
        
        GenericEntry<Long, Integer> entryLong = new GenericEntry<Long, Integer>(10l, 22);
        System.out.println(entryLong.getData()+ " " + entryLong.getCodigo());

    }
}
